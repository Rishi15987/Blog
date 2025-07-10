package Heaps.Med;

import java.util.PriorityQueue;

public class nropes {
    public static void main(String[] args) {
        int[] arr = {2,5,4,8,6,9};
        System.out.println(minCost(arr));
    }
    public static int minCost(int[] arr) {
        int tCost=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int a:arr){
            minHeap.add(a);
        }
        while(minHeap.size()>=2){
            int rope1 = minHeap.poll();
            int rope2 = minHeap.poll();
            tCost = tCost + rope1 + rope2;
            minHeap.add(rope1+rope2);
        }
        return tCost;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Man to easy question no worry

"What I learned"


“When to apply”*/