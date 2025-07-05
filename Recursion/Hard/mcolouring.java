package Recursion.Hard;

import java.util.List;

public class mcolouring {
    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{2,3},{3,4},{3,5},{4,5}};
        int v = 6;
        int m = 3;
        System.out.println(graphColoring(v, List.of(edges), m));
    }
    
    static boolean graphColoring(int v, List<int[]> edges, int m) {
        int [] nodecolor = new int [v];
        return backtrack(0,v,edges,m,nodecolor);
    }
    static boolean backtrack(int node, int v, List<int[]> edges, int m, int[] nodecolor){
        if(node==v) return true;
        for(int color=1; color<=m ; color++){
            if(isSafe(node,edges,color,nodecolor)){
                nodecolor[node]=color;
                if(backtrack(node+1,v,edges,m,nodecolor)) return true;
                nodecolor[node]=0;
            }
        }
        return false;
    }
    static boolean isSafe(int node, List<int[]> edges, int color, int[] nodecolor){
        for(int [] e:edges){
            if(e[0]==node && nodecolor[e[1]]==color) return false;
            if(e[1]==node && nodecolor[e[0]]==color) return false;
        }
        return true;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//Smae pattern for lloop to check each error and then irritating is is safe only


"What I learned"


“When to apply”*/