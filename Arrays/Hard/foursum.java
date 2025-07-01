package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class foursum{
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums, 0).toString());
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        if(i!=0 && nums[i]==nums[i-1]) continue;
        for(int j=i+1; j<nums.length; j++){
            if(j!=0 && nums[j]==nums[j-1]) continue;
            int k=j+1;
            int l=nums.length-1;
            while (k<l) {
                int sum= nums[i]+nums[j]+nums[k]+nums[l];
                if(sum==target){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    k++;l--;
                    while(k<l && nums[k]==nums[k-1]) k++;
                    while(k<l && nums[l]==nums[l+1]) l--;
                }
                else if(sum<target){
                    k++;
                }
                else{
                    l--;
                }
            }
        }
    }
    return list;
    }
}
// Step 5
/*Summary of problem
 

Approach (in your own words)
// Nice one i know for 4 sum two can be taken from 2 for loops and rest start from next and end
IMp is to sort it first
and for each index like i j k l check case for same value to consider by arr[i] == arr[i-1]

"What I learned"
 Revision

“When to apply”*/