package StackQueues.Med;

import java.util.ArrayDeque;
import java.util.Deque;

public class maxslidingwindow {
    public static void main(String[] args) {
        
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int p=0;
        int ans[] = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                ans[p++]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Man this is a good question see brute is ok Priorityqueue is also ok but using Deque man u will thought ok store 3 take max and remove one 
thena againn add one get max same but the thing is how u are going to get max u will using sorting thats a bad technique. so how man that a logic
see if u will think out of three only two of them can be max so see u iterate add each element but also in each iteration u should see if something is inside
which is less than current then remove.

"What I learned"
Hell of a logic

“When to apply”*/