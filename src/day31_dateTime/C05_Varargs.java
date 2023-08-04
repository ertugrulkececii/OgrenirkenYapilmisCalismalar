package day31_dateTime;

public class C05_Varargs {
    public static void main(String[] args) {

        toplama(3,5); //8
        toplama(3,5,7);//15
        toplama(3,5,1,4);//13
        toplama(3,5,6,8,9);//31
        toplama(6,8,9,5,6,8);//42
    }

    private static void toplama(int... sayi) {

        int toplam=0;
        for (int i = 0; i < sayi.length; i++) {

            toplam+=sayi[i];
        }

        System.out.println("Verilen int sayilarinin toplami : "+toplam);
    }

}
