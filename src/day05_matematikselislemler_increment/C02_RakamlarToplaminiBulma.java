package day05_matematikselislemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //kullanicidan 3 basamakli bir sayi alip sayinin rakamlarini toplayip yazdirlaim.

        Scanner scanner = new Scanner( System.in);
        System.out.println("LUTFEN 3 BASAMAKLI BIR TAM SAYI GIRINIZ : ");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        girilenSayi = girilenSayi / 10;

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        girilenSayi = girilenSayi / 10;

        System.out.println("Rakamlar toplami : " + rakamlarToplami);

    }

}
