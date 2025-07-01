package Heaps.Easy;

import java.util.PriorityQueue;

public class sortksortedarr {
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        nearlySorted(arr, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void nearlySorted(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        for (; index <= Math.min(k, n - 1); index++) {
            pq.offer(arr[index]);
        }

        int i = 0;
        for (; index < n; index++) {
            arr[i++] = pq.poll();
            pq.offer(arr[index]);
        }
        while (!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// 1st logic hits is create min heap and thats correct also
so create minheap of pnly k size it will do its work so poll top add in arr
the simliarly add another from arr again poll till full arr what you will left with sorted 
poll rest and add

"What I learned"


“When to apply”*/