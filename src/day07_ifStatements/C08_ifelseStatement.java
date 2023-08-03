package day07_ifStatements;

import java.util.Scanner;

public class C08_ifelseStatement {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
       Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen 3 kenari giriniz");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

                if(kenar1==kenar2 && kenar2==kenar3 && kenar2>0) {
                    System.out.println("ESkenar ucgen");
                }
                else {
                    System.out.println("Eskenar degil");
                }




    }


}
