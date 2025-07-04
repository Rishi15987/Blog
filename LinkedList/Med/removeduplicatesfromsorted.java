package LinkedList.Med;

public class removeduplicatesfromsorted {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
       int i = 0, size = nums.length;

        for (int j = 1; j < size; j++) {
            if (nums[i] == nums[j]) {
                continue;
            }
            nums[i + 1] = nums[j];
            i++;
        }

        return i+1;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Man this one is tricky 
challenge is 2 same elem is fine what when 3 4 are same elem
//So remember there is one trick take i=0 j =1 now in same arr you will change updated see think what if you update the already came element there it self
and compare with ahead one by this suppose you saw 1 you kept at index 1 then j will move and move until you find diff then only update in same array.


"What I learned"


“When to apply”*/