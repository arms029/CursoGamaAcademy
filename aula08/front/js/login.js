
function login(){
    let user = document.getElementById("txtUser").value;
    let senha = document.getElementById("txtSenha").value;

    let usuario = {
        email: user,
        cpf: user,
        senha: senha
    };

    let mensagem = {
        method: 'POST',
        body: JSON.stringify(usuario),
        headers: {
            'Content-type':'application/json'
        }
    }

    const URL_LOGIN = 'http://localhost:8080/user/login';

    fetch(URL_LOGIN, mensagem)
        .then(res => validaLogin(res));
}

function validaLogin(resultado){
    if(resultado.status == 200){
        resultado.json().then(resultado => efetuaLogin(resultado));
    } else {
        document.getElementById("msgError").innerHTML = "Usuário/senha incorretos";
    }
}

function efetuaLogin(usuario){
    console.log("Entrando com... ", usuario);
    localStorage.setItem("userLogged",JSON.stringify(usuario));
    window.location = "consulta.html";
}
