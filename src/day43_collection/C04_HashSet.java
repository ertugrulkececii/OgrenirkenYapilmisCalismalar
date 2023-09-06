package day43_collection;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class C04_HashSet {
    public static void main(String[] args) {



    /*
    Soru : Bir HashSet ve TreeSet olusturun. Bir loop ile bu set’lere element ekleyip sureleri karsilastirin.
     */
        HashSet<Integer> hashSet = new HashSet<>();

        TreeSet<Integer> treeSet = new TreeSet<>();

        Random rnd = new Random();

        int hasBas = LocalTime.now().getNano();

        for (int i = 1; i < 10000; i++) {
            hashSet.add(rnd.nextInt(1000));
        }

    }
}
