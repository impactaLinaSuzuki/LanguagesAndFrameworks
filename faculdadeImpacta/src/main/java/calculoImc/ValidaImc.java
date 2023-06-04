package calculoImc;


public class ValidaImc {
    public static String ValidaMassaCorporal(double imc){
        String validacao = "";
        
        if(imc < 18.5){
            validacao = "Magreza";
        } else if(imc >= 18.5 && imc < 24.9){
            validacao = "Normal";
        }
        else if(imc >= 24.9 && imc < 30){
            validacao = "Sobrepeso";
        } else if(imc >= 30){
            validacao = "Obesidade";
        }
        return validacao;
    }
}
