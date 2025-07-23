package Learnsyntax;

import java.util.*;

public class Comparatoruse {
    public static void main(String[] args) {
        Comparator<String> comp = (a,b)-> a.length() > b.length() ? 1 : -1;
            

        List<String> list = new ArrayList<>();
            list.add("Ravi");
            list.add("Rajesh");
            list.add("Ravindar");
            list.add("Rakeh");

        Collections.sort(list,comp);
        System.out.println(list);
        // Comparator<Integer> comp = new Comparator<Integer>()
        // {
        // public int compare(Integer a, Integer b){
        //     if(a%10>b%10)
        //         return 1;
        //     else
        //         return -1;
        // }
        // };

        // List<Integer> list = new ArrayList<>();
        // list.add(45);
        // list.add(41);
        // list.add(42);
        // list.add(49);

        // Collections.sort(list,comp);
        // System.out.println(list);
    }
}
