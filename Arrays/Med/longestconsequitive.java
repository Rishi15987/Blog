import java.util.HashSet;
import java.util.Set;

public class longestconsequitive {
    public static void main(String[] args) {
        int arr [] = {1,100,2,4,3,200};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] arr) {
        if(arr.length ==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int count =1;
        int maxCount =1;
        for(int element : set){
            if(!set.contains(element-1)){
                count =1;
                while(set.contains(element+1)){
                    ++count;
                    ++element;
                }
            }

            if(count> maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}
// Step 5
/*Summary of problem
 

Approach (in your own words)
// One way is sort array then find
// one is use array index whichever are contguous count it.
// onr is using heap as duplication goes away and use it like if x-1 is not there (!heap.contains(x-1))
then count the occurences of x+1 until there count store max x-1 is needed because if 1234 is there 
for only 1 it should be valid as for rest it will count if you don't keep it x-1 then 2 3 4 all will be considered.

"What I learned"
new shitt

“When to apply”*/