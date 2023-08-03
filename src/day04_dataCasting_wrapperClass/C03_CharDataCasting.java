package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {
        /*char data turu ozel bir data turudur. her ne kadar char daat turu '' icerisiinde
        sayi , harf, ozel karakter alsada ascii tablosundaki sayisal degerleri de kullanabilir.

        */
        int sayi1 = 1;
        char ch1 =  'a';

        System.out.println("ch1 : " + ch1);
        System.out.print("sayi1 :"+ (int) ch1);

        int karakter = 66;

         char asciDegeri=(char)karakter;

        System.out.println("Verilen sayinin asci tablosundaki degeri: " + asciDegeri);

    }
}
