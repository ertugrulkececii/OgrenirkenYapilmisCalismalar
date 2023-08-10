package day34_Inheritance;

public class HRunner {
    public static void main(String[] args) {

        GAvciKuslar avciKusKartal= new GAvciKuslar();

        //Avci kuslar class'indan aldigi ozellikler
        avciKusKartal.hareket();//ucarlar
        avciKusKartal.beslenme();//et yerler
        avciKusKartal.pence();//pencelidir
        avciKusKartal.gaga();//sivri gagali



        avciKusKartal.kanat();//kanatlidirlar
        avciKusKartal.solunum();//akcigerle nefes alirlar
        avciKusKartal.cogalma();//yumurtayla cogalirlar

        // Hayvanlar Class'indan alidigi ozellikler
        avciKusKartal.omur(); //yasar ve olurler
    }
}
