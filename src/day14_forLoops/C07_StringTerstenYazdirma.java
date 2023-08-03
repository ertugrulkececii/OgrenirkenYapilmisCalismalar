package day14_forLoops;

import java.util.Scanner;

public class C07_StringTerstenYazdirma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen tersten yazdirmak istedigniz metni giriniz: ");
        String str = scanner.nextLine();
        // Java Candir


        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));

        }
        //terse cevrilmis halini kaydedelim

        String tersMetin = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersMetin += str.charAt(i);

        }

        System.out.println("TErse cevrilen metin : ");
    }
}
