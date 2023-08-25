package day44_Maps;

import java.lang.management.ManagementPermission;
import java.util.Map;

public class C04_IsimSoyisimIleOgrenciBulma {
    //ogrenci map'inde verilen isim ve soyisim'e sahip ogrencilerin isim,soyisim, sinif ve subelerini yazdirin.
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.isimSoyisimIleOgrenciBul(ogrenciMap,"ALI","CAN");
    }
}
