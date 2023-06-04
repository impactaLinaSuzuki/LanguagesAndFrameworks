package calculoImc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Meu peso: ");
        double weight = 55.4;
       
        System.out.println("Minha altura: ");
        double height = 1.60;
        
        double imc = weight / (height * height);

        String validacao = ValidaImc.ValidaMassaCorporal(imc);
        System.out.println( "Você está na categoria: " + validacao );
    }
}
