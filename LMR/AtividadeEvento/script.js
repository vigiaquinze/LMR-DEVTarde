function cadastroEvento(){
var nomeEvento = document.getElementById("nomeEvento").value;
var dataEvento = document.getElementById("dataEvento").value;
var numeroParticipantes = document.getElementById("numeroParticipantes").value;
var nomePalestrante = document.getElementById("nomePalestrante").value;
if (nomeEvento=null){alert("Nome do evento inválido")};
if (dataEvento<19/05/2023){alert("Data do evento inválido")};
if (numeroParticipantes>100){alert("Número de participantes excede o limite")}
else if (numeroParticipantes<=0){alert("Número de participantes não pode ser zero")};
if (nomePalestrante=null){alert("Nome de palestrante inválido")};
alert("Nome do evento: " +nomeEvento+ "\nData do evento: "+dataEvento+ "\nNúmero de participantes: "+numeroParticipantes+ "\nNome do palestrante: "+nomePalestrante)
}
