package LinkedList.Med;

public class trappinrainwater {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] arr) {
        int n= arr.length;
        int left[] = new int[n];
        left[0]=arr[0];
        for(int i=1; i<n; i++){
            left[i]=Math.max(left[i-1], arr[i]);
        }
        int right[] = new int[n];
        right[n-1]=arr[n-1];
        for(int i= n-2; i>=0; i--){
            right[i]=Math.max(right[i+1], arr[i]);
        }
        int count=0;
        for(int i=0; i<n; i++){
            count+=Math.min(left[i], right[i])-arr[i];
        }
        return count;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//Step 1 create two arrays for storing each element left max size building and same for right;
// but trick is you have to compare the current element in arr and you madeup arr for left index before same for rightt
// then when ready eith both then substract each elemnt from arr and minumum of both left right.
Thas' it


"What I learned"


“When to apply”*/