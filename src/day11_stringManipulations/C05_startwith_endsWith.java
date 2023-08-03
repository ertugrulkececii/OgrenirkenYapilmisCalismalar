package day11_stringManipulations;

public class C05_startwith_endsWith {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        // str Java ile mi basliyor?

        System.out.println(str.startsWith("Java"));

        //str J ile mi baslar?

        System.out.println(str.startsWith("J"));

        // str Ja ile mi basliyor?

        System.out.println(str.startsWith("Ja"));

        //str "Java cok guzel" ile mi basliyor?

        System.out.println(str.startsWith("Java cok guzel"));

        System.out.println(str.startsWith(""));//true

        //5.indexten sonrasi c ile mi baslar?]
        System.out.println(str.startsWith("c", 5));
        // 6,indexten sonrasi ok ile mi baslar?
        System.out.println(str.startsWith("ok",6));

    }
}
