package day35_inheritance;

public class BToyota extends Araba{
   BToyota (){
      System.out.println("Toyota parametresiz constructor calisti");
   }
   // parent class'daki bazi ozellikleri update edebiliriz
   public String marka = "Toyota";
   String uretimYeri = "Toyota araclar japonya ve Turkiye'de uretilir";
   // parent class'da olmayan yeni ozellikler ekleyebiliriz
   public String lastik = "Tum toyota araclar pirelli lastik kullanir";
   public String guvenlik = "Tum Toyota araclar extra guvenlik icerir";
   public String fren = "Toyota araclar abs fren sistemi kullanir";


}
