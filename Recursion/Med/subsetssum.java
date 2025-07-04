package Recursion.Med;

import java.util.ArrayList;

public class subsetssum {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println(subsetSums(arr));
    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(0,0,res,arr);
        return res;
    }
    static void helper(int ind, int sum, ArrayList<Integer> res, int[] arr){
        if(ind==arr.length){
            res.add(sum);
            return;
        }
        helper(ind+1, sum+arr[ind], res, arr);
        helper(ind+1, sum, res, arr);
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)/
// easy only have done so many time choose not choose use helper ind and sum idx will move each time 
choose not choose means to sum or not rest you know.


"What I learned"
0 i thought i had to add separately but when you will dry run you will see one time sum is 0 so no worrries for extra addition


“When to apply”*/
// when you need all subsets