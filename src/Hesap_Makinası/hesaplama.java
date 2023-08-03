package Hesap_Makinası;

import java.util.Scanner;

public class hesaplama {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen ilk sayıyı girin: ");
    double sayi1 = input.nextDouble();

    System.out.print("Lütfen ikinci sayıyı girin: ");
    double sayi2 = input.nextDouble();

    System.out.print("Lütfen bir işlem türü girin (+, -, * veya /): ");
    char islem = input.next().charAt(0);

    double sonuc;

    switch (islem) {
        case '+':
            sonuc = sayi1 + sayi2;
            break;

        case '-':
            sonuc = sayi1 - sayi2;
            break;

        case '*':
            sonuc = sayi1 * sayi2;
            break;

        case '/':
            sonuc = sayi1 / sayi2;
            break;

        default:
            System.out.println("Geçersiz işlem türü");
            return;
    }

    System.out.println(sayi1 + " " + islem + " " + sayi2 + " = " + sonuc);
}
}
