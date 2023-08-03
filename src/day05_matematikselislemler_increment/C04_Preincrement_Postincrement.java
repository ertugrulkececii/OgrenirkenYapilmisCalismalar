package day05_matematikselislemler_increment;

public class C04_Preincrement_Postincrement {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++);
        System.out.println(a);
        int a1= 54;
        int b= a1++;
        System.out.println(a1 +"," + b);
        int c= 22;
        int d= --c;
        System.out.println(c + "," + d);
    }
}
