package Heaps.Med;

import java.util.TreeMap;

public class Handsofstraight {
    public static void main(String[] args) {
        int[] hand = {1,2,3,6,2,3,4,7,9};
        int groupSize = 3;
        System.out.println(isNStraightHand(hand, groupSize));
    }
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int h : hand) {
            map.put(h, map.getOrDefault(h, 0) + 1);
        }

        while (!map.isEmpty()) {
            int first = map.firstKey(); 
            for (int i = 0; i < groupSize; i++) {
                int card = first + i;
                if (!map.containsKey(card)) return false;

                map.put(card, map.get(card) - 1);
                if (map.get(card) == 0) {
                    map.remove(card);
                }
            }
        }
        return true;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//SO u see store occurences in Tree map so u can pull smallest at once
so use while loop map has  values check card+i is avaialble pr not if not return false
if there the reduce is occurences by 1 Thats is done

"What I learned"


“When to apply”*/