package day07_ifStatements;

import java.util.Scanner;

public class C07_ifElseStatement {
    public static void main(String[] args) {

        //kullanicidan notunu isteyin 50> ise sinifi gectin deild=se kaldin yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        double not= scanner.nextDouble();

        if (not>=50  ) System.out.println("Sinifi gectin");
        if (not<50) System.out.println("Maalesef kaldin");


        //kolay yolu

        if (not>=50){
            System.out.println("Siinifi gectin");
        }else{
            System.out.println("Maalesef kaldin");
        }



    }
}
