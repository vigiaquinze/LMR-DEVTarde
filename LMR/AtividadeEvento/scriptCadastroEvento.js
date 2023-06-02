function previewFile() {
    let preview = document.querySelector('img');
    let file = document.querySelector('#fotoEvento').files[0];
    let reader = new FileReader();

    reader.onloadend = function () {
        preview.src = reader.result;
    }
    if (file) {
        reader.readAsDataURL(file);
    } else {

    }
}

function cadastroEvento1() {
    var nomeEvento = document.getElementById("nomeEvento").value;
    var dataEvento = document.getElementById("dataEvento").valueAsDate;
    var numeroParticipantes = document.getElementById("numeroParticipantes").value;
    var nomePalestrante = document.getElementById("nomePalestrante").value;
    var dataHoje = (new Date()).toLocaleDateString('pt-BR');
    var erroForm = false;
    if (nomeEvento == "") { alert("Nome do evento inválido"); erroForm = true; }
    else if (dataEvento < dataHoje) { alert("Data do evento inválido"); erroForm = true; }
    else if (numeroParticipantes > 100) { alert("Número de participantes excede o limite"); erroForm = true; }
    else if (numeroParticipantes <= 0) { alert("Número de participantes não pode ser zero ou menor"); erroForm = true; }
    else if (nomePalestrante == "") { alert("Nome de palestrante inválido"); erroForm = true; }
    else {
        let imagem = document.querySelector('#fotoEvento').files[0];
        let reader = new FileReader();
        let preview = document.querySelector('img');
        reader.onloadend = function () {
            preview.src = reader.result;
        }
        
        let card = `
        <div class="card" style="width: 28rem; justify-content: center; margin:20px; display:block;" id="cardEvento1" data-bs-theme="dark">
        <img src="${preview.src}" width="20rem" height="320px" style="object-fit:cover;""
            class="card-img-top" alt="Foto do evento">
                <div class="card-body" style="justify-content: center;">
                    <h2 class="card-title" id="nomeEventoDigitado" style="text-transform: uppercase;">${nomeEvento}</h2>
                    <hr>
                    <h5 class="card-title">Palestrante: </h5>
                    <p class="card-title" id="nomePalestranteDigitado" style="font-weight: 900;">${nomePalestrante}</p>
                    <hr>
                    <h5 class="card-text">Participantes:</h5>
                    <p class="card-text" id="numeroParticipantesDigitado" style="font-weight: 900;">${numeroParticipantes}</p>
                    <hr>
                    <p class="card-text" id="dataEventoDigitado">${dataEvento.toLocaleDateString('pt-BR')}</p>
                    <a href="#" class="btn btn-primary" style="display:flex; justify-content: center;">Mais informações</a>
                </div>
        </div>`;
        document.getElementById("eventoCadastrado").innerHTML += card;
        preview.src=""
        cEventos.reset();
    };
}