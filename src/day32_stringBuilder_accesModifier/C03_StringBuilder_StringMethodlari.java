package day32_stringBuilder_accesModifier;

public class C03_StringBuilder_StringMethodlari {
    public static void main(String[] args) {

        String str= "Java Candir";

        StringBuilder sb1= new StringBuilder();
        //sb1=str; //altini cizer!!!

        sb1=new StringBuilder(str);

        System.out.println(sb1); // Java Candir
        System.out.println(sb1.substring(0, 4));// Java
        System.out.println(sb1);// Java Candir
        System.out.println(sb1.toString().contains("J"));
    }
}
