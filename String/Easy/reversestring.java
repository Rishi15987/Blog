package String.Easy;

public class reversestring {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s=s.trim();
        String [] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1; i>=0 ; i--){
            sb.append(str[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
yo know what to do just use trim split wisely.

"What I learned"


“When to apply”*/