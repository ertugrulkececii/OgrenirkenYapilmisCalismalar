package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz");

        String girilenIsim = scanner.nextLine();
        System.out.println("Lutfen soy isminizi giriniz");
        String girilenSoyisim = scanner.nextLine();

        System.out.println("lutfen yasinizi giriniz");

        int girilenYas = scanner.nextInt();
        System.out.println("Isminiz ; " + girilenIsim);
        System.out.println("Soyisminiz ; "+girilenSoyisim);
        System.out.println("yasiniz ;" + girilenYas );
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
    }
}
