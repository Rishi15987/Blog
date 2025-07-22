package StackQueues.Hard;

public class celebrityproblem {
    public static void main(String[] args) {
        int mat[][] = {{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(celebrity(mat));
    }
    public static int celebrity(int mat[][]) {
        int top =0;
        int n =mat.length;
        int down=n-1;
        
        while(top<down){
            if(mat[top][down]==1) top++;
            else if(mat[down][top]==1) down--;
            else {top++;down--;}
        }
        if(top>down) return -1;
        for(int i=0; i<n;i++){
            if(i==top) continue;
            else if(mat[top][i]==1 || mat[i][top]==0) return -1;
        }
        return top;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Man amazing question 1st i thought what but if you know the logic then easy
logic is u need to find person whom no one knows as question says so better watch video for better understanding
filter possiblity using top down method rest

"What I learned"
Mind bogling logic

“When to apply”*/