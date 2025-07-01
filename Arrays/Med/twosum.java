import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        twosum obj = new twosum();
        int [] result = obj.twoSum(nums, target);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp= target-nums[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// when u see this question this logic should hit like target-nums[i] so reduce the element from target - nums[i] 
so  ultimately id the reduced is in array that it. use hashmap.

"What I learned"
Brush up Hashmap logic.

“When to apply”*/