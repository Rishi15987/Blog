package Binarysearch.Hard;

public class medianoftwosortedarray {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int m = nums1.length;
    //     int n = nums2.length;
    //     int[] num3 = new int[m + n];
    //     int i = 0, j = 0, k = 0;
    //     while (i<m && j<n) {
    //         if(nums1[i]<nums2[j]){
    //             num3[k++]=nums1[i++];
    //         }
    //         else{
    //             num3[k++]=nums2[j++];
    //         }
    //     }
    //     while(i<m){
    //         num3[k++]=nums1[i++];
    //     }
    //     while(j<n){
    //         num3[k++]=nums2[j++];
    //     }
    //     if ((m + n) % 2 != 0) { 
    //         return num3[(m + n) / 2];
    //     } else { 
    //         int midIndex = (m + n) / 2;
    //         double p = num3[midIndex];
    //         double q = num3[midIndex - 1];
    //         return (p + q) / 2.0;
    //     }
    // }

    // BEST APPROACH
    public static double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        if(n1>n2) return findMedianSortedArrays(b,a);
        int low=0;
        int high=n1;
        int left=(n1+n2+1)/2;
        int n = n1+n2;
        while(low<=high){
            int mid1=(low+high)>>1;
            int mid2=left-mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE, r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if(mid1<n1) r1=a[mid1];
            if(mid2<n2) r2=b[mid2];
            if(mid1-1>=0) l1=a[mid1-1];
            if(mid2-1>=0) l2=b[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n%2==1) return Math.max(l1,l2);
                else{
                    return (double) (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }
            else if(l1>r2){
                high=mid1-1;
            }
            else low=mid1+1;
        }
        return 0;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//1st Naive approach well u will think of not to merge then do something but merging is need after this nothing much left to do.
//2nd is a bit complex watch video only way to remember.

"What I learned"


“When to apply”*/