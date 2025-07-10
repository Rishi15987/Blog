package LinkedList.Hard;

public class findpages {
    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        System.out.println(findPages(arr, 2));
    }
    public static int findPages(int[] arr, int k) {
        if(arr.length<k) return -1;
        int max=0;
        int sum=0;
        for(int a:arr){
            max= Math.max(max,a);
            sum+=a;
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid = (low + high) / 2;
            int count=1;
            int currsum=0;
            for(int i=0; i<arr.length;i++){
                if(currsum+arr[i]>mid){
                    count++;
                    currsum=arr[i];
                }
                else{
                    currsum+=arr[i];
                }
            }
            if(count<=k){
                ans = mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
looks hard but very easy
Whenever you see binary search simple is find what low can be and what high in between only only you need
to look and check is it working for me never be afraid of binary search easist DSA question.


"What I learned"
How to think to calculate high and low

“When to apply”*/
// Whenever you see binary search 