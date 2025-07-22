package GreddyAlgo.Easy;

import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int l = 0, r= 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l < s.length && r < g.length){
            if(g[r] <= s[l]){
                r++;
            }
            l++;
        }
        return r;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Nice question greddy word only says no less it wnat exact or more so need to satisfy max kids as they want or say greedy
so 2 pointer approach is best but it will not come at once in thought

"What I learned"


“When to apply”*/