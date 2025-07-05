package Recursion.Hard;

public class sudukosolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solveSudoku(char[][] board) {
        solve(board);
    }
    static boolean solve(char[][] board){
        for( int row=0;row<9;row++){
            for( int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char num = '1'; num<='9';num++){
                        if (isSafe(board,row,col,num)){
                            board[row][col]=num;
                            if (solve(board)) return true;
                            board[row][col]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isSafe(char[][] board, int row, int col, char num){
        for(int i=0;i<9;i++){
            if(board[row][i] == num || board[i][col] == num) return false;
        }
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for( int i=startRow; i<startRow+3; i++){
            for(int j=startCol; j<startCol+3; j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Imp that this even if u use recursion 2 for loops are needed any how to iterate then 1 more for each element to check fitting then is safe
then recursion also easy not to do much either put numeric or .


"What I learned"
brushup

“When to apply”*/
//only in suduko as of now