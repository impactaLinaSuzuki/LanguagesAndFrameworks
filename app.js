async function Main() {
    console.log("hello world");

    let question = "Qual é o seu peso?";
    const weight = await GetUserInfo(question);

    question = "Qual é sua altura?";
    const height = await GetUserInfo(question);

    const imcResult = CalculatedImc(weight, height);
    console.log(`Seu IMC: ${imcResult}`);

    CheckProportion(imcResult);

    console.log("Fim da aplicação");
}


function GetUserInfo(question) {
    const userInfo = CreateReadlineInterface();
    
    return new Promise ( function (resolve) {
        userInfo.question(`${question}`, (inputValue) => {
            if(inputValue) {
                if(question.includes("peso") ) {
                    console.log(`Seu peso: ${inputValue}`);
                }
                else{
                    console.log(`Sua altura: ${inputValue}`);
                }
                resolve(inputValue);
            }
            else {
                console.log("Valor inválido. Aplicação encerrada.")
            }
            userInfo.close();
        });
    } );
}


function CreateReadlineInterface() {
    return require('readline').createInterface({
        input: process.stdin,
        output: process.stdout
    });
}

function CalculatedImc(weight, height) {
    const imc = weight / (height * height);

    if(imc <= 0) {
        throw "Erro ao calcular IMC";
    }
    return imc;
}

function CheckProportion(imc) {
    if(imc > 0 && imc < 18.5) {
        console.log("Magra");
    }
    else if(imc >= 18.5 && imc < 24.9) {
        console.log("Normal");
    }
    else if(imc >= 24.9 && imc <= 30) {
        console.log("Sobrepeso");
    }
    else if(imc > 30) {
        console.log("Obesidade");
    }
}

Main();