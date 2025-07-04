package Recursion.Med;

import java.util.ArrayList;
import java.util.List;

public class kthpermutationsequence {
    public static void main(String[] args) {
        System.out.println(getPermutation(4, 17));
    }
    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact=1;
        for(int i=1; i<=n; i++){
            numbers.add(i);
            fact*=i;
        }
        k--;
        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++){
            fact=fact/(n-i);
            int index = k/fact;
            res.append(numbers.get(index));
            numbers.remove(index);
            k=k%fact;
        }
        return res.toString();
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Man looks very hard but its damn simple when you know how to calculate mathematically.
// so inp is if asked k then u should find k-- btter watch video to understand.

"What I learned"
New concept

“When to apply”*/