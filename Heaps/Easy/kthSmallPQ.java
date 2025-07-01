package Heaps.Easy;

import java.util.PriorityQueue;

public class kthSmallPQ {
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 3));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.offer(nums[i]);
        }
        for(int j=k; j<nums.length; j++){
            if(nums[j] > pq.peek()){
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
Step 1 think as if you can make only k elements available in a minheap then eventually that
smallest is the kth largest.
So 2 just make a min heap inclue only k elements and compare top element with other left occurences 1 by 1
as they are not added compare with peak if its bigger replace with it. that's it
Now min heap will do its work will keep smallest at peak.

"What I learned"
heapify

“When to apply”*/