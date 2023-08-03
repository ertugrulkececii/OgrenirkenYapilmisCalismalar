package day07_ifStatements;

import java.util.Scanner;

public class C06_bagimsizifCumleleri {
    public static void main(String[] args) {
        // kullanicidan pozptif bir tam sayi iste
        //sayi 3 e veya 5 ile bolunebiliyorsa
        // "Guzel sayi yazdirin.
        Scanner scanner= new Scanner (System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi %3 == 0 || girilenSayi %5 == 0) System.out.println("Guzel sayi");

    }
}
