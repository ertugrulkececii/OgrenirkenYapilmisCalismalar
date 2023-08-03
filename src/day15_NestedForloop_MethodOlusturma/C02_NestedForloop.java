package day15_NestedForloop_MethodOlusturma;

import java.util.Scanner;

public class C02_NestedForloop {
    public static void main(String[] args) {

        /*
        Kullanicindan 2 rakam alin ilk rakam satir
        2.rakam sutun olmak uzere asagidaki sekli cizdirin


        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("satir sayisi girin");
        int satir= scanner.nextInt();
        System.out.println("lutfen sutun girin");
        int sutun= scanner.nextInt();

        for (int j = 1; j <satir ; j++) {

            for (int i =1; i <=sutun ; i++) {
                System.out.print("*  ");

            }
            System.out.println("");

        }


    }
}
