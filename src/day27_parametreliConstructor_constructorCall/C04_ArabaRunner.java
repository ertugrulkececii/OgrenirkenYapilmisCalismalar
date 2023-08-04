package day27_parametreliConstructor_constructorCall;

public class C04_ArabaRunner {
    public static void main(String[] args) {


        C03_Araba araba1=new C03_Araba();
        System.out.println(araba1);
        C03_Araba araba2= new C03_Araba("Mercedes","E340", 2023, 5000, "Kirmizi");
        System.out.println(araba2);
    }
}
