function previewFile() {
    let preview = document.querySelector('img');
    let file    = document.querySelector('#fotoParticipante').files[0];
    let reader  = new FileReader();
  
    reader.onloadend = function () {
      preview.src = reader.result;
    }
    if (file) {
      reader.readAsDataURL(file);
    } else {
      
    }
  }
