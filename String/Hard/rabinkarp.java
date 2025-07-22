package String.Hard;

public class rabinkarp {
    
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(new rabinkarp().repeatedStringMatch(a, b));   
    }
    public int repeatedStringMatch(String a, String b) {
        int minRepeats = (int) Math.ceil((double) b.length() / a.length());

        // Try minRepeats and minRepeats + 1 (handles boundary cases)
        for (int count = minRepeats; count <= minRepeats + 1; count++) {
            StringBuilder repeated = new StringBuilder();
            for (int i = 0; i < count; i++) {
                repeated.append(a);
            }

            if (repeated.toString().contains(b)) {
                return count;
            }
        }

        return -1;
    }

}
// Step 5
/*Summary of problem


Approach (in your own words)
No idea why its hard

"What I learned"


“When to apply”*/