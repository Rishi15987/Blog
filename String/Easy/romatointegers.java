package String.Easy;

import java.util.HashMap;

public class romatointegers {
    public static void main(String[] args) {
        String s = "D";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
    int sum = 0;
    int x = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    while (x < s.length()) {
        if (x + 1 < s.length() && map.get(s.charAt(x)) < map.get(s.charAt(x + 1))) {
            sum += map.get(s.charAt(x + 1)) - map.get(s.charAt(x));
            x += 2;
        } else {
            sum += map.get(s.charAt(x));
            x++;
        }
    }

    return sum;
}
}
// Step 5
/*Summary of problem


Approach (in your own words)
easy one 

"What I learned"


“When to apply”*/