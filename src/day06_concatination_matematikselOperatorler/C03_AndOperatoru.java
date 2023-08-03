package day06_concatination_matematikselOperatorler;

public class C03_AndOperatoru {
    public static void main(String[] args) {

        System.out.println( 5> 3 && 6>4); //true

        System.out.println(5<3 && 6>4); // false

        System.out.println(5>3 && 6<= 4); //false

        System.out.println(5<3 && 6<=4); // false

        //And operatoru ile baglanan boolean ifadeler akc tane olursa olsun hepsi true ise sonuc true
        // bunun disindaki tum durumlarda false dur. Bu yonuyle matematikteki carpmaya benzer.

        int sayi= 24;
        System.out.println(sayi % 2 ==0 && sayi%3 ==0 && sayi % 5 == 0);

        //sayi 0 veya daha buyuk olmali ve 100 veya daha kucuk olmalidir.

        System.out.println(sayi >= 0 && sayi<= 100);




    }
}
