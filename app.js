function Main() {
    console.log("hello world");

    const peso = prompt("Digite seu peso: ");
    console.log('Seu peso: ', peso);
}

function CalculatedImc(weight, height) {
    const imc = weight / (height * height);
    return imc;
}

function CheckProportion(imc) {
    switch(imc) {
        case imc <= 0:
            return "Erro ao calcular IMC";
            break;

        case imc > 0 && imc < 18.5:
            return "Magra";
        break;

        case imc >= 18.5 && imc < 24.9:
            return "Normal";
            break;

        case imc >= 24.9 && imc <= 30:
            return "Sobrepeso";
            break;

        case imc > 30:
            return "Obesidade";
            break;

            default:
                break;
    }
}