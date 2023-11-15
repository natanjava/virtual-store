function verificarLogin(){
    let logado = (localStorage.getItem('logado') == 'logado') ? true : false;
    return logado;
}

function verificarAutorizacao(){
    if(verificarLogin()) return true;
    else location.href="index.html";
}

function verificarAutorizacaoAdmin(){
    if(localStorage.getItem('admin') == "true") return true;
    else location.href="index.html";
}

function renderizarQuantidade(valor){
    localStorage.setItem('quantidadeItens', valor);
    let quantidade = (verificarLogin()) ? localStorage.getItem('quantidadeItens') : 0;
    $('#quantidade-carrinho').html(quantidade);
}

function alterarSessao(){
    let mensagem = (verificarLogin()) ? "Hello "+localStorage.getItem('nome') : "Log in please";
    $("#estadoUSuario").html(mensagem);
}

function abrirMeusDados(){
    (verificarLogin()) ? location.href="meusDados.html":
    gerarMessageBox(2, "You must log in to access your personal data!!", "Ok");
}

function abrirMeusPedidos(){
    (verificarLogin()) ? location.href="meusPedidos.html":
    gerarMessageBox(2, "You must log in to access your orders!!", "Ok");
}

function travarTela() {
    document.documentElement.style.overflow = 'hidden';
    document.body.scroll = "no";
}

function destravarTela() {
    document.documentElement.style.overflow = 'auto';
    document.body.scroll = "yes";
}

function deslogar(){
    localStorage.logado="";
    localStorage.codigo="";
    localStorage.token="";
    localStorage.nome="";
    localStorage.quantidadeItens="";
    localStorage.endereco="";
    location.href="index.html";
}

function tratarErro(err){
    if(err.status == 403) gerarMessageBox(2, "No authorization:<br><br> Your authentication token has expired or does not exist. For security reasons you will be logged out and redirected to the home page.", "Ok");
    
    else if (err.status == 400) gerarMessageBox(2, "Alert! <br><br>Due to technical limitations, this test system registers only 12 products.", "Proceed");
	
	else if (err.status == 401) gerarMessageBox(2, err.responseJSON.message, "Proceed");
	
    else gerarMessageBox(2, err.responseJSON.message, "Ok");
}

function gerarMessageBox(cor, mensagem, textoBtn){
    let corDeFundo = (cor == 1) ? "rgb(214, 253, 226)" : "rgb(253, 214, 214)";

    $('#esconder').addClass('ativo')
    $('#mensagem').css("transform", "translateY(250px)").css("background", corDeFundo);
    $('#textoMensagem').html(mensagem);
    $('#btnMessage').html(textoBtn);

    travarTela();
}

function fecharMessageBox(){
    destravarTela();
    $('#esconder').removeClass('ativo')
    $('#mensagem'). css("transform", "translateY(-250px)");

    if($('#btnMessage').html() == "Proceed") location.reload();
    if($('#btnMessage').html() == "Prosseguir") location.reload();
    if($('#btnMessage').html() == "Ok") deslogar();
}

function includeFooter() {
    const footerContainer = document.querySelector(".footer-container");
    fetch("footer.html")
      .then(response => response.text())
      .then(content => {
        footerContainer.innerHTML = content;
      }
    );
}

function includeMenu() {
    const menuContainer = document.querySelector(".menu-links");
    fetch("menu.html")
      .then(response => response.text())
      .then(content => {
        menuContainer.innerHTML = content;
      }
    );
}

 // Call the function to include: -> Footer -> menu
 includeFooter();
 includeMenu();