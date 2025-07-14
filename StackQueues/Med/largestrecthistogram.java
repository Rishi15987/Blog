package StackQueues.Med;

import java.util.Stack;

public class largestrecthistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        largestrecthistogram l = new largestrecthistogram();
        System.out.println(l.largestRectangleArea(heights));
    }
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int ps[] = new int[heights.length];
        int ns[] = new int[heights.length];

        Stack<Integer> s= new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=heights.length;
            }else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        s =new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0; i<heights.length; i++){
            int cArea = (ns[i]-ps[i]-1)* heights[i];
            maxArea = Math.max(cArea, maxArea);
        }
        return maxArea;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
A great question sum of 2 problems so what u should think when u see the wuestion what could be the range from left to right so that i can get max area
once you thought of this then think rainwater tapping how u did so how can i get value at particular index simple prev smaller and next smaller
and the diff * the height of that index will give area.
So now ps you can calculate using stack same for ns
that's it done

"What I learned"
revision of prev smaller and next smaller

“When to apply”*/