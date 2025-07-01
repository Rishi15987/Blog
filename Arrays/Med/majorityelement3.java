import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class majorityelement3 {

    public static void main(String[] args) {
        int [] nums = {3,2,3};
        List<Integer> result = majorityElement(nums);
        System.out.println(result);
    }
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i=0; i< nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        map.forEach((key,value) ->{
            if(value> (nums.length/3)){
                list.add(key);
            }
        });
        return list;
    }
}
// Step 5
/*Summary of problem
 

Approach (in your own words)
// you may think of using arrays indexes but more optimized if u use hashmap
// in this case map size will be lesser compared to arrays

"What I learned"
use of lambda function for iterating map

“When to apply”*/