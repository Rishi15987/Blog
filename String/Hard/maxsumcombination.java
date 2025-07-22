package String.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class maxsumcombination {
    public static void main(String[] args) {
        int[] a = {4, 2, 5, 1};
        int[] b = {8, 0, 5, 3};
        int k = 3;
        System.out.println(topKSumPairs(a, b, k));
    }
    public static ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        Arrays.sort(a);
        Arrays.sort(b);
        int N = a.length;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        HashSet<String> set = new HashSet<>();
        maxHeap.add(new int[]{a[N - 1] + b[N - 1], N - 1, N - 1});
        set.add((N - 1) + "," + (N - 1));

        ArrayList<Integer> res = new ArrayList<>();

        while (k-- > 0 && !maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            res.add(top[0]);

            int i = top[1], j = top[2];

            if (i > 0 && set.add((i - 1) + "," + j)) {
                maxHeap.add(new int[]{a[i - 1] + b[j], i - 1, j});
            }

            if (j > 0 && set.add(i + "," + (j - 1))) {
                maxHeap.add(new int[]{a[i] + b[j - 1], i, j - 1});
            }
        }

        return res;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Man its a question make you think looks easy feel like u almost got this but still
critical i see is has set use man i know duplication it will but that's feels un necessary but its needed.

"What I learned"


“When to apply”*/