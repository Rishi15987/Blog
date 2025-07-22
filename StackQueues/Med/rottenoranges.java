package StackQueues.Med;

import java.util.LinkedList;
import java.util.Queue;

public class rottenoranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }
    public static int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<pair> q = new LinkedList<>();
        int fresh=0;
        int max=0;

        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==2){
                    q.offer(new pair(i,j,0));
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            pair p = q.poll();
            max=Math.max(max,p.t);

            for(int dir=0; dir<4; dir++){
                int nx=p.r+dx[dir];
                int ny=p.c+dy[dir];

                if(nx>=0 && ny>=0 && nx<n && ny<m && grid[nx][ny]==1){
                    grid[nx][ny]=2;
                    fresh--;
                    q.offer(new pair(nx,ny,p.t+1));
                }
            }
        }
        return fresh==0?max:-1;
    }
}
class pair{
        int r,c,t;
        pair(int row, int col, int time){
            this.r=row;
            this.c=col;
            this.t=time;
        }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Amazing question brillianr logic key is take a class which can store addess with count of 2's.
Rest please watch video for better understanding.

"What I learned"
BFS method which says to check in four directions and DFS says says check in 1 direction til depth

“When to apply”*/