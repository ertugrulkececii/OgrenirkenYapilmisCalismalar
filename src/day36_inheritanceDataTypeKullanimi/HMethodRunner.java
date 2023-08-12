package day36_inheritanceDataTypeKullanimi;

public class HMethodRunner extends GAvciKuslar{
    public static void main(String[] args) {
        GAvciKuslar avciKusKartal= new GAvciKuslar();
        //constructor ve data turu ayni ise ilk bulunan deger gecerlidir.
        avciKusKartal.hareket();
        avciKusKartal.beslenme();
        avciKusKartal.pence();
        avciKusKartal.gaga();
        avciKusKartal.kanat();
        avciKusKartal.solunum();
        avciKusKartal.cogalma();
        avciKusKartal.omur();

        FKuslar kusKartal= new GAvciKuslar();
        //constructor ve data turu ayni degil ise
        //aramaya data turu olan classtan baslanir ve bulunmazsa CTE verir.
        //bulursa, bulunan classdan constructer'in oldugu class'a kadar bu ozelligin daha guncel hali var mi diye kontrol
        //edilir.Ve varsa en guncel hali yazilir.
        kusKartal.hareket();
        kusKartal.beslenme();
        //kusKartal.pence();
        kusKartal.gaga();
        kusKartal.kanat();
        kusKartal.solunum();
        kusKartal.cogalma();
        kusKartal.omur();

        EHayvanlar hayvanKartal = new GAvciKuslar();



    }
}
