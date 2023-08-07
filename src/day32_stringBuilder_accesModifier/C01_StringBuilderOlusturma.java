package day32_stringBuilder_accesModifier;

public class C01_StringBuilderOlusturma {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();
        //bos bir sb olusturur
        System.out.println(sb1); // hiclik yazdirir
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity());// 16 karakterlik yer ayirir.

        StringBuilder sb2= new StringBuilder("Java Candir.");
        System.out.println(sb2); //Java Candir.
        System.out.println(sb2.length()); //12
        System.out.println(sb2.capacity());//16 + 12 =28

        StringBuilder sb3= new StringBuilder(9);
        System.out.println(sb3); //
        System.out.println(sb3.length()); //
        System.out.println(sb3.capacity());//
    }
}
