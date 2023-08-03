package day07_ifStatements;

import java.util.Scanner;

public class C09_ifelseSorularHouseWork {

    public static void main(String[] args) {

        /*  Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.*/

        /*Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your age :");
        int yas= scanner.nextByte();
        int sonuc= 67-yas;
        if(yas>=67){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Calismaniz gereken yillar : "+sonuc);}  */



/*
        Soru 4- Kullanicidan bir karakter girmesini isteyin,
               girilen karakterin buyuk harf olup olmadigini yazdirin.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz :" );

      char girilenKarakter = scanner.next().charAt(0);

      if(girilenKarakter >= 'A' )
          System.out.println("Girilen karakter buyuk harf");
       else
              System.out.println("Buyuk harf degil");

      }


    }













       /*
        Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
        */



