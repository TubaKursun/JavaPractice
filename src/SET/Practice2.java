package SET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {

    public static void main(String[] args) {

        HashSet<Integer>hashSet = new HashSet<>();
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();

        TreeSet <Integer> treeSet = new TreeSet<>();

        hashSet.add(11);                            linkedHashSet.add(28);                  treeSet.add(39);
        hashSet.add(12);                            linkedHashSet.add(27);                  treeSet.add(39);
        hashSet.add(13);                            linkedHashSet.add(23);                  treeSet.add(39);
        hashSet.add(14);                            linkedHashSet.add(24);                  treeSet.add(39);
        hashSet.add(null);                          linkedHashSet.add(null);                treeSet.add(39);
        System.out.println(hashSet);                System.out.println(linkedHashSet);
        System.out.println("******");               System.out.println("******");           System.out.println("******");
        System.out.println();
    }

    ArrayList<String > veggies = new ArrayList<>();

}
