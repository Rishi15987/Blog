package StackQueues.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterEle {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ans = nextGreaterElement(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = getNG(nums2);

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            mp.put(nums2[i], i);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nge[mp.get(nums1[i])];
        }

        return ans;
    }
    static int[] getNG(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return ans;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Easy question only using stack you can store next greater element at extact index of element after that 
extraction is long use hashmap to store index then use hashmap index then find through stack as per num1 arr

"What I learned"


“When to apply”*/