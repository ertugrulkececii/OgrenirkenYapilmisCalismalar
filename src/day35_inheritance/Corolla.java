package day35_inheritance;

public class Corolla extends BToyota{

    Corolla(){
        System.out.println("Corolla parametresiz constracter calisti");
    }
    String uretimYeri="Sakarya/Turkiye";
    String model = "Corolla";
    String aku = "Inci aku";
    String sanziman = "Cvt";

    public static void main(String[] args) {

        Corolla corolla= new Corolla();
    }

    //
}
