package Recursion.Med;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class combinationsum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }
    public static void backtrack(int start, int[] candidates, int target, List<Integer> current, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
        }
        if(target<0){
            return;
        }
        for(int i=start; i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            current.add(candidates[i]);
            backtrack(i+1, candidates, target-candidates[i], current, result);
            current.remove(current.size()-1);
        }
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// same as previous ones diff is here same element cannot be used
so in recursion for loop is there still id+1 is there rest is easy.


"What I learned"
A lot of things doing things in pattern is very helpful.

“When to apply”*/