import java.util.ArrayList;
import java.util.List;

public class setmatrix0 {
    public static void main(String[] args) {
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i=0; i<matrix.length;i++){
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0; i<row.size();i++){
            for(int j=0; j<matrix[0].length;j++){
                matrix[row.get(i)][j]=0;
            }
        }
        for(int i=0; i<col.size();i++){
            for(int j=0; j<matrix.length;j++){
                matrix[j][col.get(i)]=0;
            }
        }
    }
}
// Step 5
/*Summary of problem
Need to set 0 for those row and columns where a val is 0 so its leading row and col should also be 0.

Approach (in your own words)
// Migth feel hard but just challenge is to store row and col at one place because fetcing and change at once is not possible
// once you have row and col store just pick one by one and as per its col and row set val to 0.
// always start with mat the mat[o] otherwise for uneven matrix you will get error.

"What I learned"
how to use mat and mat[0]

“When to apply”*/
