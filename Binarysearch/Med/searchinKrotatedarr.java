package Binarysearch.Med;

public class searchinKrotatedarr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
    public static int search(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k) return mid;
            else if(arr[low]<=arr[mid]){
                if(k>=arr[low] && k<=arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(k>=arr[mid] && k<=arr[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Nice question if u stuck what to do where to go left or right then check the element can lie
between low mid or between mid high as per it move low high.


"What I learned"


“When to apply”*/