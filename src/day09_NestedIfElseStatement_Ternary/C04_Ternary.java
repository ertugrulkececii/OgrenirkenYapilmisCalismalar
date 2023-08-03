package day09_NestedIfElseStatement_Ternary;

public class C04_Ternary {
    public static void main(String[] args) {

        // input oalrak verilen bir sayinin 3 ile tam bolunup bolunmedigini bulun

        int input=20;

       // input%3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor";
        //bu soruda ternary bize bir string donduruyor, bunu ya direk yazdirmalisniz ya da
        //bir String atamalisiniz.

       // System.out.println(input%3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor");

        String sonuc=input%3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor";
        System.out.println(sonuc);

        //
    }
}
