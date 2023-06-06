function previewFile() {
    let preview = document.querySelector('img');
    let file = document.querySelector('#fotoParticipante').files[0];
    let reader = new FileReader();

    reader.onloadend = function () {
        preview.src = reader.result;
    }
    if (file) {
        reader.readAsDataURL(file);
    } else {

    }
}

function cadastroParticipante1() {
    var nomeParticipante = document.getElementById("nomeParticipante").value;
    var dataNascimentoParticipante = document.getElementById("dataNascimentoParticipante").valueAsDate;
    var emailParticipante = document.getElementById("emailParticipante").value;
    var senhaParticipante = document.getElementById("senhaParticipante").value;
    var erroForm = false;
    if (nomeParticipante == "") { alert("Nome não pode estar vazio"); erroForm = true; }
    else if (emailParticipante == "") { alert("E-mail inválido"); erroForm = true; }
    else if (senhaParticipante == "") { alert("Senha inválida"); erroForm = true; }
    else {
        let imagem = document.querySelector('#fotoParticipante').files[0];
        let reader = new FileReader();
        let preview = document.querySelector('img');
        reader.onloadend = function () {
            preview.src = reader.result;
        }


        let card = `
        <div class="card" style="width: 18rem; margin:20px; padding:20px; display:block;" id="cardParticipante1"
        data-bs-theme="dark">
                <div class="card-body" style="justify-content: center;">
                    <img src="${preview.src}" width="200px" height="200px" style="border-radius:50%; object-fit:cover" alt="Foto do participante">
                    <br>
                    <br>
                    <br>
                    <h2 class="card-title" id="nomeParticipanteDigitado style="font-weight: 900;">${nomeParticipante}</h2>
                    <hr>
                    <h5 class="card-title">E-mail: </h5>
                    <p class="card-title" id="emailParticipanteDigitado" style="font-weight: 900;">${emailParticipante}</p>
                    <hr>
                    <h5 class="card-text">Data de nascimento:</h5>
                    <p class="card-text" id="dataNascimentoParticipanteDigitado" style="font-weight: 900;">${dataNascimentoParticipante.toLocaleDateString('pt-BR')}</p>
                    <hr>
                    <a href="#" class="btn btn-primary" style="display:flex; justify-content: center;">Mais informações</a>
                </div>
        </div>`;
        document.getElementById("participanteCadastrado").innerHTML += card;
        preview.src = ""
        cParticipante.reset();
    };
}