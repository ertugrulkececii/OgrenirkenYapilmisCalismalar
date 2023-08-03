package day16_MethodOlusturma_Kullanma;

public class C01_MethodOlusturma {

// Soru 1- Kullanicidan input olarak verilen bir String,
    //          baslangic ve bitis indexlerine gore
    //          baslangic index'i dahil, bitis index'i haric olacak sekilde
    //          aradaki harfleri yazdiran bir method olusturun.
    //
    //          - kullanici baslangic degeri olarak,
    //            bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //          - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.


    public static void main(String[] args) {


        altString("Java guzeldir", 3,7);



    } //main method sonu
    public static void altString(String metin, int basIndex, int bitisIndex){
        if (basIndex > bitisIndex){
            System.out.println("Baslangic index'i, bitis Index'inden buyuk olamaz");
        }else if (basIndex >= metin.length() || bitisIndex >= metin.length()){
            System.out.println("Verilen index sinirlarin disinda");
        }else {
            for (int i = basIndex; i <bitisIndex ; i++) {
                System.out.print(metin.charAt(i));

            }
        }
    }

}
