//Kadanes Algo

public class Kadanes {

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max= nums[0];
        int currmax=0;

        for(int n:nums){
            if(currmax<0){
                currmax=0;
            }
            currmax+=n;
            max= Math.max(max,currmax);
        }
        return max;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Simple only just one point important make curmax 0 when curmax gets <0.
// just caculate sum of all that's it.

"What I learned"
Can be done in short only just make curmax 0 no need to do i++ or continue as if i keep the code for making 0 at start no need to do it separately.

“When to apply”*/
// When asked max sum subarray in o of 1 space