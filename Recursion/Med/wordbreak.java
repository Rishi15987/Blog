package Recursion.Med;

import java.util.List;

public class wordbreak {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        System.out.println(wordBreak(s, wordDict));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        int maxlen=0;
        for(String w: wordDict){
            maxlen = Math.max(maxlen, w.length());
        }
        for(int i=1; i<=n; i++){
            for(int j=i-1; j>=Math.max(0, (i-maxlen));j--){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Tricky part is the array which you will use dp you have to check one by one like catsandog start with c is this in worddict no then false
likewise for ca cat which ever is there put at index i = true also checking previous j or say just before index of that substring yo are checking
both is true then put true.
Trick part in 2nd loop but if you will focus you can do it.


"What I learned"
same thing repeating brushup

“When to apply”*/