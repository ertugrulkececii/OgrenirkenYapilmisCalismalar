package day15_NestedForloop_MethodOlusturma;

import java.util.Scanner;

public class C04_NestedForloop {
    public static void main(String[] args) {

        /*
        Kullanicidan satir sayisi alin ve sekili cizdirin.
        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *


         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen satir sayisini girinzi");
        int satir= scanner.nextInt();


        for (int i = 1; i <=satir ; i++) { // satir

            for (int j = 1; j <= i; j++) { //sutun

                System.out.print("*  ");

            }
            System.out.println("");

        }

    }
}
