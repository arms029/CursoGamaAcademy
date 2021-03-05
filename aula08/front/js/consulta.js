function hello(){
    let numero;
    numero = document.getElementById('chave').value;
    console.log('você digitou: ' + numero);
}

function consultarUsuarioPorId() {
    let id;
    let saida = document.getElementById('saida');
    id = document.getElementById("chave").value;
    const URL_BUSCA_COMPRAS = 'http://localhost:8080/user/compras/' + id;

    fetch(URL_BUSCA_COMPRAS)
        .then(res => validaResposta(res));
}

function validaResposta(res){
    if(res.status == 200){
        res.json().then(res => exibirDados(res));
    } else {
        document.getElementById("saida").innerHTML = "404";
    }

}

function exibirDados(res){
    let tabela = `
        <table class="tabela">
            <tr>
                <th>Descricao</th>
                <th>valor</th>
                <th>data</th>
            </tr>`;

    res.compras.forEach(compra => {
        let dataFormatada = new Date(compra.data).toLocaleDateString("pt-br"); //transforma o texto em obj Date
        tabela += `
        <tr>
            <td>${compra.descricao}</td>
            <td>${compra.valor}</td>
            <td>${dataFormatada}</td>
        </tr>`
    });

    tabela += '</table>';
    document.getElementById("saida").innerHTML = tabela;
}

function logout(){
    localStorage.removeItem("userLogged");
    window.location = "login.html";
}

function validaLogin(){
    let usuario = localStorage.getItem("userLogged");

    if (!usuario){
        window.location = "login.html";
    }

    let objUser = JSON.parse(usuario);
    document.getElementById("dadosUser").innerHTML = 'Usuário: <b>' + objUser.name + '</b> - ' + objUser.email + '<br>';
}