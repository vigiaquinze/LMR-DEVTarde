function boasVindas() {
let nome;
let sobrenome;

nome = prompt("Digite o seu nome","Digite aqui");
sobrenome = prompt("Digite o seu sobrenome","Digite aqui");

alert("Olá "+nome +" "+sobrenome);
}

function somaJs() {
    let numeroUm;
    let numeroDois;
    let resultadoSoma;

    numeroUm = prompt("Digite o primeiro número","Digite aqui...")
    numeroDois = prompt("Digite o segundo número","Digite aqui...")
    resultadoSoma = parseInt(numeroUm)+parseInt(numeroDois);
    alert(numeroUm+" + "+numeroDois+" = "+resultadoSoma)
}
function subtracaoJs() {
    let numeroUm;
    let numeroDois;
    let resultadoSoma;

    numeroUm = prompt("Digite o primeiro número","Digite aqui...")
    numeroDois = prompt("Digite o segundo número","Digite aqui...")
    resultadoSoma = parseInt(numeroUm)-parseInt(numeroDois);
    alert(numeroUm+" - "+numeroDois+" = "+resultadoSoma)
}
function multiplicacaoJs() {
    let numeroUm;
    let numeroDois;
    let resultadoSoma;

    numeroUm = prompt("Digite o primeiro número","Digite aqui...")
    numeroDois = prompt("Digite o segundo número","Digite aqui...")
    resultadoSoma = parseInt(numeroUm)*parseInt(numeroDois);
    alert(numeroUm+" x "+numeroDois+" = "+resultadoSoma)
}
function divisaoJs() {
    let numeroUm;
    let numeroDois;
    let resultadoSoma;

    numeroUm = prompt("Digite o primeiro número","Digite aqui...")
    numeroDois = prompt("Digite o segundo número","Digite aqui...")
    if (numeroDois==0){alert("Não é possível dividir por zero.")}
    else {
    resultadoSoma = parseInt(numeroUm)/parseInt(numeroDois);
    alert(numeroUm+" ÷ "+numeroDois+" = "+resultadoSoma)}
}