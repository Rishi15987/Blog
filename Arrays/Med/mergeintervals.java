import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class mergeintervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j]+",");
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();
        int [] newinterval = intervals[0];
        result.add(newinterval);

        for(int [] inter: intervals){
            if(inter[0]<=newinterval[1]){
                newinterval[1]=Math.max(newinterval[1],inter[1]);
            }
            else{
                newinterval=inter;
                result.add(newinterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
// Step 5
/*Summary of problem
 

Approach (in your own words)
// believe in you self at first glance what you will see its correct just need to compare ending with ither start
just figureout how proceed step by step a storing result 
then a array extract to compare 

"What I learned"
u may panic need to focus solution will come out.

“When to apply”*/