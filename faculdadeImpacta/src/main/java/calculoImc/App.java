package calculoImc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Entre com seu peso: ");
        double weight = RecebePesoAltura.RecebePeso();
       
        System.out.println("Entre com sua altura: ");
        double height = RecebePesoAltura.RecebeAltura();
        
        double imc = weight / height * height;

        String validacao = ValidaImc.ValidaMassaCorporal(imc);
        System.out.println( "Você está na categoria: " + validacao );
    }
}
