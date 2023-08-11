package day35_inheritance;

public class Corolla extends BToyota {

    public Corolla() {// gaorunur olarak cons.call yok
       // o zaman gorunmeyen super(); vardir

        System.out.println("Corolla parametresiz constructor calisti");

    }

    Corolla(String str) {
        // gorunmeyen super(); var
        // Java'nin koydugu ve gorunur olmayan
        // constructor call HER ZAMAM parametresiz olan
        // super();
        // Kodu yazan kisiler isterlerse ilk satira
        // baska constructor call yazabilirler
        // eger ilk satirda gorunur bir cons.call varsa
        // java default olarak koydugu super();'u siler
    }

    public String uretimYeri = "Sakarya / Turkiye";
    public String model = "Corolla";
    public String aku = "Inci aku";
    public String sanziman = "Cvt";

    public static void main(String[] args) {

        Corolla corolla = new Corolla();

        Corolla corolla1 = new Corolla("Kirmizi");

    }
}
