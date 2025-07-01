package Heaps.Easy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kthSmallestPQ {
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        System.out.println(findKthSmallest(nums, 3));
    }
    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<k; i++){
            pq.offer(nums[i]);
        }
        for(int j=k; j<nums.length; j++){
            if(nums[j] < pq.peek()){
                pq.poll();
                pq.offer(nums[j]);
            }
        }
        return pq.peek();
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//See use of heap here how
Step 1 think as if you can make only k elements available in a maxheap then eventually that
largest is the kth largest.
So step 2 just make a max heap include only k elements and compare top element with other left occurences 1 by 1
as they are not added compare with peek if its smaller replace with it why smaller you want smaller right if smallest among 
the k element is left it should be there. that's it
Now max heap will do its work will keep largest at peak.

"What I learned"


“When to apply”*/