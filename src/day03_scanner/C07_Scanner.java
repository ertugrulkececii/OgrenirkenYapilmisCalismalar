package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");

        int ilkSayi = scanner.nextInt();

        System.out.println("Lutfen 2.sayiyi giriniz");

        int ikinciSayi= scanner.nextInt();

        int temp = ilkSayi;

        ilkSayi = ikinciSayi;

        ikinciSayi = temp;

        System.out.println("ilk sayinin yeni degeri: "+ ilkSayi);
        System.out.println("ikinci sayini yeni degeri : " + ikinciSayi);
    }
}
