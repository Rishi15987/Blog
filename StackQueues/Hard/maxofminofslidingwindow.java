package StackQueues.Hard;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class maxofminofslidingwindow {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,10,70,30,80,60};
        maxofminofslidingwindow obj = new maxofminofslidingwindow();
        ArrayList<Integer> res = obj.maxOfMins(arr);
        System.out.println(res);
    }
    private static int[] nse(int[] arr)
    {
        int n = arr.length;
        int[] res = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() &&arr[st.peek()]>=arr[i])
            st.pop();
            if(st.isEmpty())
            res[i] = n;
            else
            res[i] = st.peek();
            st.push(i);
        }
        return res;
    }
    private static int[] pse(int[] arr)
    {
        int n = arr.length;
        int[] res = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() &&arr[st.peek()]>=arr[i])
            st.pop();
            if(st.isEmpty())
            res[i] = -1;
            else
            res[i] = st.peek();
            st.push(i);
        }
        return res;
    }
    public ArrayList<Integer> maxOfMins(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n,Integer.MIN_VALUE));
        if(arr==null||arr.length ==0)
        return res;
        int[] nseArr = nse(arr);
        int[] pseArr = pse(arr);
        
        for(int i=0;i<n;i++)
        {
            int spanCurrElementLen = nseArr[i]-pseArr[i]-1; 
        
            res.set(spanCurrElementLen-1,Math.max(res.get(spanCurrElementLen-1),arr[i]));
        }
        
    for(int i=n-2;i>=0;i--)
    {
        res.set(i,Math.max(res.get(i),res.get(i+1)));
    }
        return res;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
Nice one you should know the logic behind it better watch video nse pse can answer well

"What I learned"
nse pse

“When to apply”*/
///when you see max of min or min of max then apply