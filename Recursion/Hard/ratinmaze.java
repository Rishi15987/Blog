package Recursion.Hard;

import java.util.ArrayList;

public class ratinmaze {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
        System.out.println(ratInMaze(maze));
    }
    public static ArrayList<String> ratInMaze(int[][] maze) {
        boolean[][] visited = new boolean[maze.length][maze.length];
        ArrayList<String> ans = new ArrayList<>();
        helper(0, 0, visited, ans, maze, "");
        return ans;
}

public static void helper(int i, int j, boolean[][] visited, ArrayList<String> ans, int[][] maze, String curr) {    
    if (i < 0 || j < 0 || i >= maze.length || j >= maze.length || visited[i][j] || maze[i][j] == 0) {
        return;
    }

    if (i == maze.length - 1 && j == maze.length - 1) {
        ans.add(curr);
        return;
    }
    
    visited[i][j] = true;
    helper(i - 1, j, visited, ans, maze, curr + 'U');
    helper(i, j - 1, visited, ans, maze, curr + 'L');
    helper(i + 1, j, visited, ans, maze, curr + 'D');
    helper(i, j + 1, visited, ans, maze, curr + 'R');
    visited[i][j] = false;
}
}
// Step 5
/*Summary of problem


Approach (in your own words)
//Same recursion pattern what good is base case can be done in one line for lot of cases
also easy only i j up down left rigt 


"What I learned"


“When to apply”*/