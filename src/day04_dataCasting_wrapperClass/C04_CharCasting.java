package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {

        //kullnaicidan bir char isteyin
        //girilen chardan sonraki 3 karakteri yazdirin
        //orn: input :a output :b,c,d

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen Ascii tablosundan bir karakter giriniz :");
       char girilenKrk = scanner.next().charAt(0);
        System.out.println("girilen karakter : "+ girilenKrk);
    }
}
