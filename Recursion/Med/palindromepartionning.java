package Recursion.Med;

import java.util.ArrayList;
import java.util.List;

public class palindromepartionning {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
    public static List<List<String>> partition(String s) {
      List<List<String>> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;  
    }
    private static void backtrack(String s, int start, List<String> path, List<List<String>> res){
        if(start == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int end = start+1; end<= s.length(); end++){
            if(check(s, start , end-1)){
                path.add(s.substring(start, end));
                backtrack(s, end, path, res);
                path.remove(path.size()-1);
            }
        }
    }
        private static boolean check(String s, int start, int end){
        while(start<end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// same recursion logic a little diff just add palindrome check


"What I learned"


“When to apply”*/