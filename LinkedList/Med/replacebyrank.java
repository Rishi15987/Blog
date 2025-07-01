package LinkedList.Med;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class replacebyrank {
    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};
        int n = arr.length;
        int[] ans = replaceWithRank(arr, n);
        for(int a:ans){
            System.out.println(a);
        }
    }
    static int[] replaceWithRank(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int a:arr){
            pq.offer(a);
        }
        int rank =1;
        while(!pq.isEmpty()){
            int a = pq.poll();
            if(!map.containsKey(a)){
                map.put(a,rank);
                rank++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//Best approach first obvious thought make a pqueue and arr in it.
sorting is done then poll one by one still easy then add it in hashmap then waht 1 min question.


"What I learned"


“When to apply”*/