window.onload = () =>{
    if(verificarAutorizacaoAdmin()) listarPedidos();
    localStorage.setItem('filtro', "Waiting for confirmation");
}

function listarPedidos(){
     $.ajax({
        method: "GET",
        url: "/pedidos",
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Authorization", 'Bearer '+ localStorage.getItem('token'));
        }
    }).done(function (dados) {
       while($("[name='linha']").length) $('#linha').remove();
       dados.slice().reverse().forEach(item => {
           if(item.status == localStorage.getItem('filtro'))criaLinha(item);
       });
    }).fail(function (err)  {
        tratarErro(err);
    });
}

function filtrar(){
    if($('#filtrarPedidos').val() == "Waiting for confirmation") localStorage.setItem('filtro', "Waiting for confirmation");
    else if($('#filtrarPedidos').val() == "Accepted") localStorage.setItem('filtro', "Accepted");
    else localStorage.setItem('filtro', "Rejected");
    esconderDetalhe();
    listarPedidos();
}

function criaLinha(dados){
    $('#tabelaPedidos').append(
        '<div class="linha-tabela-produtos" id="linha" name="linha">'+
            '<div class="coluna-1">'+
                '<p class="texto-tabela-produtos">#'+dados.numero+'</p>'+
            '</div>'+

            '<div class="coluna-2">'+
                '<p class="texto-tabela-produtos">'+dados.quantidadeItens+'</p>'+
            '</div>'+

            '<div class="coluna-3">'+
                '<p class="texto-tabela-produtos">'+dados.data+'</p>'+
            '</div>'+

            '<div class="coluna-4">'+
                '<p class="texto-tabela-produtos">R$ '+dados.valor.toFixed(2)+'</p>'+
            '</div>'+

            '<div class="coluna-5">'+
                '<button class="btn-detalhe" onclick="renderizarDetalhamento(1, '+dados.codigo+')">See Order</button>'+
            '</div>'+
        '</div>'
    );
}
