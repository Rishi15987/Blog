package Heaps.Med;
import java.util.*;
import java.util.Arrays;

public class frequrnelements {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int k = 1;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> 
        map.get(a) - map.get(b));
        for(int n : map.keySet()){
            heap.offer(n);
            if(heap.size()>k) heap.poll();
        }
        int [] res = new int[k];
        for(int i=k-1; i>=0; i--){
            res[i]=heap.poll();
        }
        return res;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
understand the question well u just eed to store key and its freq when stored then just use queue rest is ok    

"What I learned"


“When to apply”*/