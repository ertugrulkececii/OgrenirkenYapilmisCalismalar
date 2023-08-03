package day06_concatination_matematikselOperatorler;

public class C04_Or_Operatoru {
    public static void main(String[] args) {

        System.out.println(3>5 || 6>4);//true
        System.out.println(3<5 || 6>4);//true
        System.out.println(3<5 || 6<4); //true
        System.out.println(3>5 || 6<4); //false

        // sayi 3'e veya 5'e bolunsun
       int sayi= 24;
        System.out.println(sayi %3==0 || sayi % 5==0); //true
         //sayi 0'dan buyuk veya 100 den kucuk olmalidir.

        System.out.println(sayi>0 || sayi<100); //true




    }
}
