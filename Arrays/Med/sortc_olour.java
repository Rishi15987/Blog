import java.util.Arrays;

public class sortc_olour {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int zeros=0 , ones=0, n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeros++;
            }
            else if(nums[i]==1){
                ones++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeros){
                nums[i]=0;
            }
            else if(i<zeros+ones){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }
    }
}
