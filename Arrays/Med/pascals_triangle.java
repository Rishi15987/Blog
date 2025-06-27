import java.util.ArrayList;
import java.util.List;

public class pascals_triangle {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        System.out.println(result);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0) 
            return result;
        if(numRows==1){
            List<Integer> firstrow = new ArrayList<>();
            firstrow.add(1);
            result.add(firstrow);
            return result;
        }
        result = generate(numRows-1);
        List<Integer> prevrow = result.get(numRows - 2);
        List<Integer> currow = new ArrayList<>();

        currow.add(1);
        for(int i = 1; i<prevrow.size(); i++){
            currow.add(prevrow.get(i-1)+prevrow.get(i));
        }
        currow.add(1);

        result.add(currow);
        return result;
    }
}
// Step 5
/*Summary of problem
 need to print like 
    1
   1 1 
  1 2 1 

Approach (in your own words)
// first point we need recursion we may think start from 1 but not primary case is recursion
// secound i know add 1 the  iterate prevrow and add sum of two
 and as last add 1 then finally add in result
 // but scene is edge cases here when numrow is 1 the make something default and most imp lline is 20
 rest is fine.

"What I learned"
Just figure out line 20 how you are going to use recursion and will iterate from start

“When to apply”*/