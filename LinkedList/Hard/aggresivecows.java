package LinkedList.Hard;

import java.util.Arrays;

public class aggresivecows {
    public static void main(String[] args) {
        int[] stalls = {0,3,4,7,10,9};
        int k = 4;
        System.out.println(aggressiveCows(stalls, k));
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int ans=0;
        int low=1, high = stalls[stalls.length-1]-stalls[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(stalls,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
    public static boolean check(int[] stalls, int cows, int minDist) {
    int count = 1;  
    int lastPos = stalls[0];

    for (int i = 1; i < stalls.length; i++) {
        if (stalls[i] - lastPos >= minDist) {
            count++;
            lastPos = stalls[i];
        }
        if (count >= cows) return true;
    }
    return false;
}
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Man i was afraid of this question but its damn easy haha just find low and high and you are done
// easy pattern.

"What I learned"


“When to apply”*/