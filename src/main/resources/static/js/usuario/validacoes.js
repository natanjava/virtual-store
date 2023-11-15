function verficarPreenchimentoDosCampos(nomeElementos){
    let inputs = document.getElementsByName(nomeElementos);
    let quantidadeNulo = 0;
    for(i = 0; i < inputs.length; i++)
        if(inputs[i].value.length == 0) quantidadeNulo++;

    if(quantidadeNulo == 0) return true;
    else{
        gerarMessageBox(2, "Please fill in all fields!!", "Try again");
        return false;
    };
}

function verificarErros(quantidadeDeErros, erros){
    let exibirErros = "Alert:";
    erros.forEach(erro => exibirErros += "<br><br>- "+erro);

    if(quantidadeDeErros == 0) return true;
    else{
        gerarMessageBox(2, exibirErros, "Try again");
        return false;
    }
}

function validarCamposDeSenha(){
    let quantidadeDeErros = 0;
    let erros = [];

    if(verficarPreenchimentoDosCampos('senhas')){
        if($('#senhaNova').val() != $('#confirmacaoNovasenha').val()){
            quantidadeDeErros++;
            erros.push("The new password and its confirmation must be the same");
        }

        if($('#senhaNova').val().length < 6){
            quantidadeDeErros++;
            erros.push("The new password must contain at least 6 digits");
        }

        if(verificarErros(quantidadeDeErros, erros)) return true;
    }
}

function validarEtapa1(){
    if(verficarPreenchimentoDosCampos('input-step-1')){
        let erros = [];
        let quantidadeDeErros = 0;

        for(i = 0; i < $('#nome').val().length; i++){
            if($.isNumeric($('#nome').val().substring(i, i+1))){
                erros.push("The name cannot have numbers");
                quantidadeDeErros++;
                break;
            }
        }

        if($('#mesDataNascimento').val() == "escolha" ||
           $('#diaDataNascimento').val() == "escolha" ||
           $('#anoDataNascimento').val() == "escolha"){
            erros.push("Please fill in your date of birth (day, month and year)");
            quantidadeDeErros++;
        }
		/*
        if($('#cpf').val().length != 11)  {
            erros.push("Por favor digite o CPF completo");
            quantidadeDeErros++;
        }
        else{
            if(!verficarCPF($('#cpf').val())){
                erros.push("Por favor digite um cpf válido");
                quantidadeDeErros++;
            }
        }
		 */

		/*
        if($('#emailCadastro').val().substring($('#emailCadastro').val().length - 10) != "@gmail.com") {
            erros.push("É necessário que o seu email possua o prefixo '@gmail.com' no final");
           quantidadeDeErros++;
        }
		*/
		function validarEmail(email) {
	    // Expressão regular para verificar o formato do e-mail
		    var regex = /^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/;
		    if (regex.test(email)) {
		        // valid email
		        return true;
		    } else {
		        // email not valid
		        return false;
		    }
		}
		// To validate email at the field #emailCadastro
		var email = $('#emailCadastro').val();
		if (!validarEmail(email)) {
		    erros.push("Email address ist not valid.");
		    quantidadeDeErros++;
		}


        if($('#senhaCadastro').val().length < 6) {
            erros.push("Your password must have at least 6 digits");
            quantidadeDeErros++;
        }

        if($('#celular').val().length == 0) {
            erros.push("Please type some number");
            quantidadeDeErros++;
        }

        if(verificarErros(quantidadeDeErros, erros)) return true;
    }
}

function validarEtapa2(){
    if(verficarPreenchimentoDosCampos('input-step-2')){
        let erros = [];
        let quantidadeDeErros = 0;

        if($('#cep').val().length == 0) {
            erros.push("Please type some Zip Code");
            quantidadeDeErros++;
        }

        if($('#estado').val() == "escolha") {
            erros.push("Please choose your State");
            quantidadeDeErros++;
        }

        if(verificarErros(quantidadeDeErros, erros)) return true;
    }
}
/*
function verficarCPF(cpf){
    const digitoJ = gerarDigitoVerificador(cpf, 10);
    const digitoK = gerarDigitoVerificador(cpf, 11);

    if(digitoJ == cpf.substring(9, 10) && digitoK == cpf.substring(10,11)) return true;
    else return false;
}

function gerarDigitoVerificador(cpf, maximo){
    let somaDigitos = 0;
    let inicio = 0;
    let fim = 1;
    for(var i = maximo; i >= 2; i--){
        somaDigitos += cpf.substring(inicio, fim) * i;
        inicio++;
        fim++;
    }
    if((11 - (somaDigitos % 11)) >= 10) return 0;
    else return (11 - (somaDigitos % 11));
}
*/

$(document).ready(function() {
    $("#cpf").keyup(function() {
        $("#cpf").val(this.value.match(/[0-9]*/));
    });
});

$(document).ready(function() {
    $("#celular").keyup(function() {
        $("#celular").val(this.value.match(/[0-9]*/));
    });
});


$(document).ready(function() {
    $("#cep").keyup(function() {
        $("#cep").val(this.value.match(/[0-9]*/));
    });
});

$(document).ready(function() {
    $("#numero").keyup(function() {
        $("#numero").val(this.value.match(/[0-9]*/));
    });
});

