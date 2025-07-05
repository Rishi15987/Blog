package Recursion.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nqueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    public static List<List<String>> solveNQueens(int n) {
       List<List<String>> output = new ArrayList<>();
        char[][] nQueens = new char[n][n]; 

        for (int i = 0; i < n; i++) {
            Arrays.fill(nQueens[i], '.');
        }
        helper(n, output,nQueens, 0);
        return output;
    }
    private static void helper(int n, List<List<String>> output, char[][] nQueens, int row){
        if(row==n){
            List<String> sol = new ArrayList<>();
            for(char[] r: nQueens){
                sol.add(new String(r));
            }
            output.add(sol);
            return;
        }

        for( int col=0;col<n;col++){
            if(isSafe(n,nQueens,row,col)){
                nQueens[row][col]='Q';
                helper(n,output,nQueens,row+1);
                nQueens[row][col]='.';
            }
        }
    }
     private static boolean isSafe(int n, char[][] nQueens, int row, int col) {
        for (int i = 0; i < n; i++) {
            if (nQueens[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//say the easiest of all hard question why just recursion part obvious col will be used in for loop 
also back tracking just put 0
also in is safe fnc top left and top right which is also easy


"What I learned"


“When to apply”*/