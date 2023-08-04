package day31_dateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {


    LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat);

        LocalDateTime baslamaZamani=LocalDateTime.now();
        int baslangicZamani=baslamaZamani.getNano();
       int toplam=0;

        for (int i = 0; i < 10000; i++) {

            toplam+= i;



        }
        LocalDateTime bitirmeZamani=LocalDateTime.now();
        int bitisZamani=bitirmeZamani.getNano();

        System.out.println("Islem suresi : "+ (bitisZamani-baslangicZamani));//Islem suresi : 998700 nano saniye
}
}