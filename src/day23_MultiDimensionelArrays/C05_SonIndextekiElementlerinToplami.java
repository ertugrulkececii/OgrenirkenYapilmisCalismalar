package day23_MultiDimensionelArrays;

public class C05_SonIndextekiElementlerinToplami {
    public static void main(String[] args) {

        /*
        // Soru 5- Verilen 2 katli bir array'de
//         her bir inner array'in son elementlerinin
//         toplaminini yazdiran bir method olusturun.*/

          int[][] sayilar = {{3,4,5},{1,4},{5,2,7},{1,9,0,3}};

         sonElementleriTopla(sayilar);
    }


    public static void sonElementleriTopla (int [][] sayilar){
        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam+= sayilar[i][sayilar[i].length-1];

        }
        System.out.println("Inner arraylardeki son elementlerin toplami : "+ toplam);

    }
}
