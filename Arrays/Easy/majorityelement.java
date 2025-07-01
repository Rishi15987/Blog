public class majorityelement {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int n:nums){
            if(count==0){
                candidate=n;
            }
            if(n==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
// Step 5
/*Summary of problem
 

Approach (in your own words)
// When you see it an approach will hit that correct use array indexs but space will be used
// this approach is somewhat like kadanes at some point it will be 0 either its sum or count use  this

"What I learned"
brushup

“When to apply”*/