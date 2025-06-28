public class rotateimage {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        int [][] n = new int[matrix.length][matrix[0].length];
        int index = matrix.length-1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                n[j][index] = matrix[i][j];
            }
            index--;
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = n[i][j];
            }
        }
    }
}
// Step 5
/*Summary of problem
 man just roatate 90 degree

Approach (in your own words)
// 1st its not just flip
// just right the index before and after for all that's it enough to see in one loop done.

"What I learned"
instead of paniking just write the indexes everything is not visible in brain.

“When to apply”*/
//where you see matrix without any thinking check or write down the index.