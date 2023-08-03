package day09_NestedIfElseStatement_Ternary;

import java.util.Scanner;

public class C03_Ternery {
    public static void main(String[] args) {

        //kullanicidan poz bir tam sayi alin
        //sayinin tek mi cift mi oldugunu yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir poz tam sayi giriniz: ");

        int sayi= scanner.nextInt();

        if (sayi % 2== 0){
            System.out.println("cift sayi");
        }else {
            System.out.println("tek sayi");
        }
        /*
        If else ile yapabilecegimiz basit islemleri daha kisa
        olarak ternary ile yapabiliriz.
         */
        System.out.println(sayi % 2==0 ? "cift sayi": "tek sayi");

       // int y = 10;


        //System.out.println((y >= 20) ? (2 + y) : (y-3));

       // int y = 2;

       // int z = 0;


       // int a = z>=0 ? ++y : z--;

       // System.out.println(y + "," + z + "," + a);

       /* int y = 12;

        int x = y%2>0 ? 5+y : 3*y;

        System.out.println(x);

        */

        int maas =15000;



        switch(maas) {



            case 6000:

                System.out.println("Asgari ucret");

                break;



            case 10000:

                System.out.println("Ogretmen maasi");

                break;



            case 15000:

                System.out.println("Tester maasi");

                break;



            default:

                System.out.println("yok boyle birsey");

                boolean yeni=true;
    }
}}
