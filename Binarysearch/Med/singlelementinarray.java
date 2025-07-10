package Binarysearch.Med;

public class singlelementinarray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        if(n==1) return arr[0];
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            else if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// easy question just use pen u will see since each element is twice so either it will be in left or right so if mid is even or odd index as per this u can see
non repeating element is before mid or after mid


"What I learned"


“When to apply”*/