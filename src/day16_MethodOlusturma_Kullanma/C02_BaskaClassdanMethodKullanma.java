package day16_MethodOlusturma_Kullanma;

import day16_MethodOlusturma_Kullanma.C01_MethodOlusturma;

public class C02_BaskaClassdanMethodKullanma {


    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Bu is cok guzel",3,10);

// C01_MethodOlusturma.altString('m',"ali",true);
        /*
            Bir method call sirasinda yazdigimiz degerlere ARGUMENT
            method deklarasyonundaki parantez icindeki variable'lara PARAMETRE denir
            public static void altString(String metin, int basIndex, int bitIndex ) parametre
            C01_MethodOlusturma.altString('m',"ali",true); argument
            String metin = 'm';
            int basIndex = "ali";
            int bitIndex = true;
            argument'ler ile parametreler uyumlu olmazsa java CTE (altini kirmizi cizer) verir
         */
    }
}
