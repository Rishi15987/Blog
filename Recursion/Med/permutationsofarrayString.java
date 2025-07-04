package Recursion.Med;

import java.util.ArrayList;
import java.util.List;

public class permutationsofarrayString {
    public static void main(String[] args) {
        int[] letters = {1,2,3};
        System.out.println(permute(letters));
    }

    public static List<List<Integer>> permute(int[] letters) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(new ArrayList<>(), new boolean[letters.length], res, letters);
        return res;
    }

    private static void dfs(List<Integer> path, boolean[] used, List<List<Integer>> res, int[] letters) {
        if (path.size() == used.length) {
            res.add(new ArrayList<>(path));
        }
        for( int i=0; i<letters.length;i++){
            if(used[i]) continue;
            path.add(letters[i]);
            used[i]=true;
            dfs(path, used, res, letters);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }    
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Best approach this pattern is different because you need permutations of all element 
Its not like choose not choose pattern.
So use used as boolean than swap method


"What I learned"
New concept or say way to solve problems.

“When to apply”*/