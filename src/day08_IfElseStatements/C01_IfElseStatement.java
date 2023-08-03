package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter= scanner.next().charAt('0');

        if(girilenKarakter >='A' && girilenKarakter <='Z'){
            System.out.println("GIrilen karakter buyuk harf");
        }else{
            System.out.println("Girilen karakter buyuk harf degil");}

    }
}
