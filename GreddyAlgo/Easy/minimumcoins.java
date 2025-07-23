package GreddyAlgo.Easy;

import java.util.ArrayList;
import java.util.List;

public class minimumcoins {
    public static void main(String[] args) {
        System.out.println(minPartition(43));
    }
    static List<Integer> minPartition(int N) {
        int[] value = new int[]{ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        List<Integer> coins = new ArrayList<>();
        
        int k = value.length - 1;
        
        while(N>0) {
            while(N < value[k]) {
                k--;
            }   
            while(N >= value[k] && N>0) {
                N -= value[k];
                coins.add(value[k]);
            }
        }
        return coins;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
U know just think easy its

"What I learned"


“When to apply”*/