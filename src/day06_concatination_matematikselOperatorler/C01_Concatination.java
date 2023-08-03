package day06_concatination_matematikselOperatorler;

public class C01_Concatination {
    public static void main(String[] args) {

        String s1 ="Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b= 5;
        // sadece yukaridaki variable lari kullanaral asgida verilen metinleri yazdirin

        //orn: java35

        System.out.println(s1+a+b); // "Java35"
        // orn: Java15
        System.out.println(s1+a*b); // "Java15"
        //orn: 8Candir
        System.out.println(a+b+s2); // "8Candir"
        // orn: 53Java

        System.out.println(b+(a+s1)); // "53Java"
        System.out.println(); // Stringlestirmek icin s4 u kullandik yoksa java integer olarak normal toplama islemini yapacakti.






    }
}
