package Heaps.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Ksortedarrkthposition {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 6, 4};
        System.out.println(isKSortedArray(arr, 6, 3));
    }
    static String isKSortedArray(int arr[], int n, int k) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            hp.put(arr[i], i); 
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(Math.abs(i-hp.get(arr[i]))>k){
                return "No";
            }
        }
        return "Yes";
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//Easy only just sort it and check the diff with current position with k.

"What I learned"


“When to apply”*/