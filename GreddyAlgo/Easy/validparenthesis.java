package GreddyAlgo.Easy;

public class validparenthesis {
    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                leftMin--;
                leftMax--;
            } else {
                leftMin--;
                leftMax++;
            }
            if (leftMax < 0) return false;
            if (leftMin < 0) leftMin = 0;
        }
        
        return leftMin == 0;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
please have a look at soln man thi is tricky

"What I learned"


“When to apply”*/