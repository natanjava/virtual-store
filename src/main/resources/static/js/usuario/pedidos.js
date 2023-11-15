window.onload = () =>{
    alterarSessao();
    renderizarQuantidade(localStorage.getItem('quantidadeItens'));
    if(verificarAutorizacao()) listarPedidos();
}

function gerarParcelas(){
    let valorTotal = $('#totalCarrinho').html();

    if($('#tipoPagamento').val() == "transfer") tamanho = 1;
    else if(valorTotal > 0 && valorTotal < 300) tamanho = 1;
    else if(valorTotal >= 300 && valorTotal < 600) tamanho = 2;
    else if(valorTotal >= 600 && valorTotal < 1000) tamanho = 3;
    else tamanho = 4;

    for(i = 1; i <= 12; i++) $('#parcela').remove();
    for(i = 1; i <= tamanho; i++){
        const parcela = valorTotal / i;
        $('#quantidadeParcelas').append(
            '<option value="'+i+'" id="parcela">'+i+'x de $ '+parcela.toFixed(2)+'</>'
        )
    }
}

function confirmarPedido(){
    let tipoPagamento = $('#tipoPagamento').val();
    let quantidadeParcelas = $('#quantidadeParcelas').val();

    if(tipoPagamento != "escolha" && quantidadeParcelas != "escolha"){
        $.ajax({
            method: "POST",
            url: "pedidos/cliente/"+localStorage.getItem('codigo')+"/formaPagamento/"+tipoPagamento+"/quantidadeParcelas/"+quantidadeParcelas,
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Authorization", 'Bearer '+ localStorage.getItem('token'));
            }
        }).done(function (dados) {
           renderizarQuantidade(0);
           gerarMessageBox(1, "Order registered successfully. Within 24 hours it will be accepted or rejected. If approved, you will receive an email with payment information.", "Proceed");
        }).fail(function (err)  {
                tratarErro(err);
        });
    }
    else gerarMessageBox(2, "Please select the payment type and the desired number of monthly installments.", "Try again");
}

function listarPedidos(){
    $.ajax({
        method: "GET",
        url: "/pedidos/cliente/"+localStorage.getItem('codigo'),
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Authorization", 'Bearer '+ localStorage.getItem('token'));
        }
    }).done(function (dados) {
        dados.slice().reverse().forEach(item => criarPedido(item));

        let listaStatus = document.getElementsByName('statusPedido');
        for(i = 0; i < listaStatus.length; i++){
            if(listaStatus[i].innerHTML == "Waiting for confirmation") listaStatus[i].style.color="orange";
            else if(listaStatus[i].innerHTML == "Accepted") listaStatus[i].style.color="green";
            else listaStatus[i].style.color="red";
        }
    }).fail(function (err)  {
        tratarErro(err);
    });
}

function criarPedido(dados){
    $('#containerPedido').append(
        '<div class="pedido">'+
            '<div class="margem-pedidos">'+
                '<p class="subtitulo">Date of order</p>'+
                '<p class="texto">'+dados.data+'</p>'+

                '<p class="subtitulo">Order number</p>'+
                '<p class="texto">#'+dados.numero+'</p>'+

                '<p class="subtitulo">Status</p>'+
                '<p class="texto-status" name="statusPedido">'+dados.status+'</p>'+

                '<p class="subtitulo">Value</p>'+
                '<p class="texto">$ '+dados.valor.toFixed(2)+'</p>'+

                '<button class="btn-detalhe" onclick="pegarIdPedido('+dados.codigo+')">See details</button>'+
            '</div>'+
        '</div>'
    );
}

function pegarIdPedido(id){
    localStorage.setItem('codigoPedido', id);
    location.href="detalhePedido.html";
}