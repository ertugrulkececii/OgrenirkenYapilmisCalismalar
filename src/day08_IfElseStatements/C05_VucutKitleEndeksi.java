package day08_IfElseStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {


        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu(kg) ve  boyunuzu(cm) giriniz ; ");

        double kilo= scanner.nextDouble();
        double boy= scanner.nextDouble();
        double sonuc =(kilo*10000/(boy*boy));

        if(sonuc>30) {
            System.out.println(sonuc + "Maalesef obezsiniz");
        } else if (sonuc>=25 ) {
            System.out.println(sonuc +" Ne yazikki kilolusunuz");

        } else if (sonuc >=20 ) {
            System.out.println(sonuc + "Normal insan gibisiniz:)");

        } else if (sonuc<20) {
            System.out.println(sonuc + "zayifsiniz");

        }


    }
}
