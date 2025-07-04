package Recursion.Med;
import java.util.*;
public class combinationSum1 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        System.out.println(combinationSum(arr, 7));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
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
            current.add(candidates[i]);
            backtrack(i, candidates, target-candidates[i], current, result);
            current.remove(current.size()-1);
        
        }
    }
}
// Step 5
/*Summary of problem
Need target from the given list if possible here same element can be used twice

Approach (in your own words)
// Better use for loops and use one helper or two helpers both are way only if you know for loop is needed you know two helpers is needed.


"What I learned"
// one more recursion pattern

“When to apply”*/