function cadastroParticipante1() {
    var nomeParticipante = document.getElementById("nomeParticipante").value;
    var dataNascimentoParticipante = document.getElementById("dataNascimentoParticipante").valueAsDate;
    var emailParticipante = document.getElementById("emailParticipante").value;
    var senhaParticipante = document.getElementById("senhaParticipante").value;
    const d = new Date();
    var anoMaioridade = d.getFullYear();
    var erroForm = false;
    if (nomeParticipante == "") { alert("Nome não pode estar vazio"); erroForm = true; }
    else if (dataNascimentoParticipante > anoMaioridade) { alert("Menores de idade não são permitidos"); erroForm = true; }
    else if (emailParticipante == "") { alert("E-mail inválido"); erroForm = true; }
    else if (senhaParticipante == "") { alert("Senha inválida"); erroForm = true; }
    else { alert("Perfil cadastrado!") };
    var display = document.getElementById("cardParticipante1").style.display;
    if (display == "none" && erroForm == false) {
        document.getElementById("cardParticipante1").style.display = 'block';
        document.getElementById("nomeParticipanteDigitado").innerHTML = nomeParticipante;
        document.getElementById("dataNascimentoParticipanteDigitado").innerHTML = dataNascimentoParticipante;
        document.getElementById("emailParticipanteDigitado").innerHTML = emailParticipante;
    }
    else if (display == "none" && erroForm == true) { document.getElementById("cardParticipante1").style.display = 'none'; }
}