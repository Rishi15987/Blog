package Recursion.Med;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // step 1: sort
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private static void backtrack(int[] nums, int index, List<Integer> subset, List<List<Integer>> ans) {   
        ans.add(new ArrayList<>(subset));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) { // always comes with sorting (avoiding duplicate subsets)
                continue;
            } 
            subset.add(nums[i]);
            backtrack(nums, i + 1, subset, ans);
            subset.remove(subset.size() - 1);
        }
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// see rememeber the diff between two recursion type 
// here since duplication is not allowed for loop is needed here because helper cannot be called two times
also when you start with 1 then loop will add till 2 & 2 smilarly 2 to 2.


"What I learned"
two variations are there in recursion one u use 1 for loop and one helper or 2 helpers for increasing index.

“When to apply”*/
//When you see need all subsets without duplication