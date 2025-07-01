public class searchmatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 15));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high=n*m-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
// Step 5
/*Summary of problem
 

Approach (in your own words)
// somewhat yo will think of binary search type good but hectic is that its a mtrix
so how to convert
// so remember column is something that can give you indexes
// if you take count of all indexes you can use it to get rows easily but columns with help of mid which is calucated 
from count you can calucate by / & %.
// bit tricky need to practise

"What I learned"
seems easy but not

“When to apply”*/
//when you need to find anything in matrix but matrix should be shorted