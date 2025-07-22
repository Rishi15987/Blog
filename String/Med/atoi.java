package String.Med;

public class atoi {
    public static void main(String[] args) {
        String s = "   -42";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
           s = s.trim(); // Remove leading whitespaces
        if (s.isEmpty()) {
            return 0;
        }
        return recursiveAtoi(s, 0, 0, 1);
    }
    public static int recursiveAtoi(String s, int index, int result, int sign) {
        if (index == s.length()) {
            return result * sign;
        }
        if(index==0 && (s.charAt(index)=='-' || s.charAt(index)=='+')){
            sign = (s.charAt(index)=='-')?-1:1;
            return recursiveAtoi(s, index+1, result, sign);
        }
        char currentChar = s.charAt(index);
        if (!Character.isDigit(currentChar)) {
            return result * sign;
        }
        if (Character.isDigit(currentChar)) {
            int digit = currentChar - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return recursiveAtoi(s, index + 1, result * 10 + digit, sign);
        } else {
            return result * sign;
        }
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
well well well what hectic is to handle if it excedds int limit rest is fine just need to rememeber how to check Character.isDigit 

"What I learned"


“When to apply”*/