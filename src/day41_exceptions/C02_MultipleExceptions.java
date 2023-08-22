package day41_exceptions;

import java.util.Scanner;

public class C02_MultipleExceptions {
    public static void main(String[] args) {

        String str ="Java Candir";
        int[] arr ={3,4,7,8,2,5,9,0};

        /*
        Kullanicidan bir sayi isteyip girilen sayiyi index olarak kullanin
        str' da ki o index' de ki harfi ve array'deki o index'deki sayiyi yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz: ");
        int indexSayi=scanner.nextInt();

        System.out.println(str.charAt(indexSayi));

        System.out.println(arr[indexSayi]);



    }
}
