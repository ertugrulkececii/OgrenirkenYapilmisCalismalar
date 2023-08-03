package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatement {
    public static void main(String[] args) {

        // Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen gün numarasını girin: \n(Pazartesi için 1, Salı için 2...)");
        int gunNumarasi = scanner.nextInt();
        switch (gunNumarasi){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Geçersiz giriş!");
        }



    }
}
