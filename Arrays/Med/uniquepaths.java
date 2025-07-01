public class uniquepaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
    public static int uniquePaths(int m, int n) {
        int grid [][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    grid[i][j]=1;
                }
                else{
                    grid[i][j] = grid[i-1][j]+grid[i][j-1];
                }
            }
        }
        return grid[m-1][n-1];
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Man looks hard but just focus on one step before end like recursion just find logic rest is done
// similarly for end to reach two either from top or right to reach end and the indexes are [x-1][y] & [x][y-1] this ill calculate for all.

"What I learned"
Man i learned the logic.

“When to apply”*/