package Arrays.Hard;

import java.util.HashMap;
import java.util.Map;

public class countsubarrwithxor {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        System.out.println(subarrayXor(arr, 6));
    }
    public static long subarrayXor(int arr[], int k) {
        Map<Integer,Integer> map = new HashMap<>();
        long cnt=0;
        map.put(0,1);
        int xor=0;
        for(int i=0; i<arr.length; i++){
            xor^=arr[i];
            int a = k^xor;
                cnt+=map.getOrDefault(a,0);
                map.put(xor,map.getOrDefault(xor,0)+1);
        }
       return cnt; 
    }
}
// Step 5
/*Summary of problem
 

Approach (in your own words)
// use hashmap and keep 0,1 there now a^b=c then obvious c^b =a.
So need to add xor in map if not there if there increase the cnt.

"What I learned"
 easy way same logic for arrrays as well

“When to apply”*/