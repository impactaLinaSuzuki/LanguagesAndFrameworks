package calculoImc;


import java.util.Scanner;

public class RecebePesoAltura {
    public static double RecebePeso(){
       Scanner readWeight = new Scanner(System.in);
       double weight = readWeight.nextDouble();
       readWeight.close();
       return weight;
    }

    public static double RecebeAltura(){
        Scanner readHeight = new Scanner(System.in);
        double height = readHeight.nextDouble();
        readHeight.close();
        return height;
     }
}
