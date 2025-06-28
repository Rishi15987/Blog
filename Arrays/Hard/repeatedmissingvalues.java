package Arrays.Hard;

class repeatedmissingvalues {
    public static void main(String[] args) {
        int [][] grid = {{1,3},{2,2}};
        int [] ans = findMissingAndRepeatedValues(grid);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;
        int []  count =  new int [size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n; j++){
                count[grid[i][j]]++;
            }
        }
        int a=-1, b=-1;
        for(int num=1; num<=size; num++){
            if(count[num]==2){
                a=num;
            }
            if(count[num]==0){
                b=num;
            }
        }
        return new int[]{a, b};
    }
}
// Step 5
/*Summary of problem
 simple

Approach (in your own words)
// Man this carries a trick or i say its obvious but i didn't think of it well other ways are there to do
// So when u see this think as what if u store the index occurrence in an array as it numeric limited to length problem solved


"What I learned"
think think arrays index can be used in many ways

“When to apply”*/