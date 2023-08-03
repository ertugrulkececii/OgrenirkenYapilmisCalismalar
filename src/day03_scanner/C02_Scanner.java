package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("lutfen bir tam sayi giriniz");

        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayinin karesi : " +girilenSayi*girilenSayi);
    }
}
