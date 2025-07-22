package String.Med;

public class longestpalin {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String val="";
        int n = s.length();
        for( int i=1; i<s.length(); i++){
            int low=i, high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            if(low==-1 || high ==n) break;
            }
            String palin = s.substring(low+1,high);
            if(palin.length()> val.length()){
                val=palin;
            }

            low=i-1; high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            if(low==-1 || high ==n) break;
            }
            palin = s.substring(low+1,high);
            if(palin.length()> val.length()){
                val=palin;
            }
        }
        return val;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
After some thought its common better to reach at each word and expand both sides see once you think binary search you will see directly not possible
 but someway somewhat is possible then fine only even odd need to be handled

"What I learned"


“When to apply”*/