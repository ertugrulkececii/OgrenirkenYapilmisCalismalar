package day13_StringManipulations_forLoops;

public class C04_ReplaceFirst {
    public static void main(String[] args) {

        String str = "Java Candir, kendisini cok seviyoruz123.";

        // sadece ilk a yi buyuk a yap.

        System.out.println(str.replaceFirst("a", "A"));

        //JAva Candir

        // ilk space yi 2 space haline getirin.
        //regular expresion= belirli kisaltmalar.
        System.out.println(str.replaceFirst(" ", "  "));

        // ilk sayiyi space haline donusturun
        System.out.println(str.replaceFirst("\\d", " "));
        // Java Candir, kendisini cok seviyoruz 23.

        // ilk ozel karakteri * olarak degistirin
        System.out.println(str.replaceFirst("\\W", "*"));
        // Java*Candir, kendisini cok seviyoruz123.



    }
}
