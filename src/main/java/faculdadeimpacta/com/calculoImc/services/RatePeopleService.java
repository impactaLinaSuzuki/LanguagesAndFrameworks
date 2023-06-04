package faculdadeimpacta.com.calculoImc.services;

public class RatePeopleService {
    public String VerifiyCategory(double imc) {
        String classificacao = "";
        if(imc < 18.5) {
            classificacao = "Magreza";
        }
        else if(imc >= 18.5 && imc < 24.9) {
            classificacao = "Normal";
        } else if (imc >= 24.9 && imc < 30) {
            classificacao = "Sobrepeso";
        } else if(imc >= 30) {
            classificacao = "Obesidade";
        }
        return classificacao;
    }
}
