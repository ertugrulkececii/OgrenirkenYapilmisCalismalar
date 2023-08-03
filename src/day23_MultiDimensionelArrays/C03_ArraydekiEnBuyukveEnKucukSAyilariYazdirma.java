package day23_MultiDimensionelArrays;

public class C03_ArraydekiEnBuyukveEnKucukSAyilariYazdirma {
    public static void main(String[] args) {

        int[][]arr= { {3,6,8 },{2,5,9},{1,3},{12,23,34}};

        /* verilen bir 2 katli int arraydeki en buyuk ve en kucuk sayiyi bulup yazdiran bir method oluasturun

         */

        enBuyukveEnKucukYazdir(arr);
    }

    public static void enBuyukveEnKucukYazdir (int [][] arr){


        int enKucukSAyi= arr[0][0];
        int enBuyukSayi= arr[0][0];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                //arr[i][j]
             if (arr[i][j]<enKucukSAyi){
                 enKucukSAyi= arr[i][j];

             }
             if( arr[i][j]>enBuyukSayi){

                 enBuyukSayi= arr [i][j];
             }

            }
        }
        System.out.println("En kucuk sayi : " + enKucukSAyi);
        System.out.println("En buyuk sayi : " + enBuyukSayi);
    }
}
