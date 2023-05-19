function nParImpar() {
    let nParImpar = document.getElementById("nDigitado").value;
    if (nParImpar % 2 == 0) { alert(nParImpar + " é um número par.") }
    else { alert(nParImpar + " é um número ímpar.") }
}

function calculoSwitch() {
    let numeroUm = document.getElementById("numeroUm").value;
    let numeroDois = document.getElementById("numeroDois").value;
    let operacao = document.getElementById("opLogicos").value;
    let resultado = 0;
    switch (operacao) {
        case "+": resultado = parseInt(numeroUm) + parseInt(numeroDois);
            alert(numeroUm + " + " + numeroDois + " = " + resultado);
            break;
        case "-": resultado = parseInt(numeroUm) - parseInt(numeroDois);
        alert(numeroUm + " - " + numeroDois + " = " + resultado);
            break;
        case "*": resultado = parseInt(numeroUm) * parseInt(numeroDois);
        alert(numeroUm + " × " + numeroDois + " = " + resultado);
            break;
        case "/": resultado = parseInt(numeroUm) / parseInt(numeroDois);
            if (numeroDois==0) {
                alert("Não é possível dividir por zero");
            } else {
                alert(numeroUm + " ÷ " + numeroDois + " = " + resultado);
            }
            break;
    }
}