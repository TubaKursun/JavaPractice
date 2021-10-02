package SET;

import java.util.ArrayList;
import java.util.HashSet;

public class Practice3 {

    public static void main(String[] args) {
         // you are given an array of colors
        // find out and store dublicate elements in to an array list from this array

        // String[] colors = {"red", "black", "black", "white", "red", "orange"};
        // eliminate duplicate

        HashSet colors = new HashSet();
        colors.add("red");
        colors.add("black");
        colors.add("black");
        colors.add("white");
        colors.add("red");
        colors.add("orange");

        System.out.println(colors);



    }
}
