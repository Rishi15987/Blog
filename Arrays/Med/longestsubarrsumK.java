import java.util.HashMap;
import java.util.Map;
public class longestsubarrsumK {
    public static void main(String[] args) {
        int arr [] = {10, 5, 2, 7, 1, -10};
        int k=15;
        System.out.println(longestSubarray(arr, k));
    }
    public static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen = Math.max(maxLen, i+1);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                maxLen= Math.max(maxLen,i-map.get(sum-k));
            }
        }
        return maxLen;
    }
}
// Step 5
/*Summary of problem
 

Approach (in your own words)
// SO remember one thing when calculating sum with target always hashmap is used
Not only this only for checking that sum - arr[i] in map never keep subtracted element
in map either the element will be saved of contiguous sum.


"What I learned"
Precisly how to use hashmap for sum with target either its longest or sum is possible

“When to apply”*/