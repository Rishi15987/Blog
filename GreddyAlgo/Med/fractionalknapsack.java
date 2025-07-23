package GreddyAlgo.Med;

import java.util.Arrays;

public class fractionalknapsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        fractionalknapsack f=new fractionalknapsack();
        System.out.println(f.fractionalKnapsack(values, weights, W));
    }
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        item[] items=new item[values.length];
        for(int i=0; i<values.length; i++){
            items[i]=new item(values[i],weights[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.getRatio(),a.getRatio()));
        Double res=0.0;
        for(item i: items){
            if(i.wt<=W){
                res+=i.points;
                W=W-i.wt;
            }
            else{
                res+=i.getRatio()*W;
                break;
            }
        }
        return Math.round(res * 1e6) / 1e6;
    }
class item{
    int points;
    int wt;
    public item(int points, int wt){
        this.points=points;
        this.wt=wt;
    }
    double getRatio(){
        return (double) points/wt;
    }
}
}
// Step 5
/*Summary of problem


Approach (in your own words)
what you should think of how to choose right ones first logic is short it by which gives mac value so once max value we used
then we can ensure we can maximize it. will be easy if you merge both arrsy in one for sorting.

"What I learned"
Learned a lot of usage of Comparable and Comparator.

“When to apply”*/