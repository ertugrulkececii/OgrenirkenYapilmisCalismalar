package day06_concatination_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {
     int a = 10;
     int b = 20;

     // Java'da = isareti karsilastirma degil, atama isaretidir.

     b= 2*a;

     // Java' da esitligi kontrol etmek istersek == kullaniriz.
        System.out.println(b==2*a); //20 == 20 ==>true

        //asignment'a esitligin sol tarafinda sadece variable bulunur.
        //sol tarfata matematiksel islem olmaz
        // karsilastirma operatorleinde iki taraftada islem olabilir.

        System.out.println(3*b > 5*a ); // 60 > 50 ==> true
        System.out.println(b>=b-a);
        System.out.println(a<=b-a);

        // Java" da karsilastirma operatorlerinde kullanilan ! isareti boolean dergeri terse cevirir.

        System.out.println(a<b); // true

        System.out.println (!(a<b)); //!true=false

        System.out.println(a!=b); // true











    }
}
