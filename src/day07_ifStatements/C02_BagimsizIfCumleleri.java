package day07_ifStatements;

import java.util.Scanner;

public class C02_BagimsizIfCumleleri {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;

        if (a<b) {
            System.out.println("a'b'den kucuk 1");
            System.out.println("a'b'den kucuk 2");
            System.out.println("a'b'den kucuk 3");
        }

        if(a % 2 ==0 )
            System.out.println("a 2 ile tam bolunuyor 1");
            System.out.println("a 2 ile tam bolunuyor 2");
            System.out.println("a 2 ile tam bolunuyor 3");

        //Soru 1- Kullanicidan bir pozitif tam sayi isteyin,
          //      sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi girin");

        int girilenSayi= scanner.nextInt();

        if (girilenSayi % 5 == 0) System.out.println("Sayi 5'in tam kati");








    }

}
