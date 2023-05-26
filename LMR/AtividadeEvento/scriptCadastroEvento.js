function cadastroEvento1() {
    var nomeEvento = document.getElementById("nomeEvento").value;
    var dataEvento = document.getElementById("dataEvento").valueAsDate;
    var numeroParticipantes = document.getElementById("numeroParticipantes").value;
    var nomePalestrante = document.getElementById("nomePalestrante").value;
    var dataHoje = new Date();
    var erroForm = false;
    if (nomeEvento == "") { alert("Nome do evento inválido"); erroForm = true;}
    else if (dataEvento < dataHoje) { alert("Data do evento inválido"); erroForm = true;}
    else if (numeroParticipantes > 100) { alert("Número de participantes excede o limite"); erroForm = true;}
    else if (numeroParticipantes <= 0) { alert("Número de participantes não pode ser zero ou menor"); erroForm = true;} 
    else if (nomePalestrante == "") { alert("Nome de palestrante inválido"); erroForm = true;}
    else {alert("Evento agendado!")};
    var display = document.getElementById("cardEvento1").style.display;
    if(display == "none"&&erroForm == false) {
        document.getElementById("cardEvento1").style.display = 'block';
        document.getElementById("nomeEventoDigitado").innerHTML = nomeEvento;
        document.getElementById("nomePalestranteDigitado").innerHTML = nomePalestrante;
        document.getElementById("numeroParticipantesDigitado").innerHTML = numeroParticipantes;
        document.getElementById("dataEventoDigitado").innerHTML = dataEvento;}
    else if (display =="none"&&erroForm == true)
        {document.getElementById("cardEvento1").style.display = 'none';}
}