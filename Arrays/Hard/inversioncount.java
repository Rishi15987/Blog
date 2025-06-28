package Arrays.Hard;

public class inversioncount {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }
     static int inversionCount(int[] arr) {
        return countInv(arr, 0, arr.length - 1);
    }
    static int countInv(int[] arr, int l, int r) {
        int res = 0;
        if (l < r) {
            int m = (r + l) / 2;
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }
    static int countAndMerge(int [] arr, int l, int m, int r){
        int [] b = new int[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        int swap =0;
        while (i<=m && j<=r) {
            if(arr[i]<=arr[j]){
                b[k++]=arr[i++];
            }
            else{
                b[k++]=arr[j++];
                swap += m-i+1;
            }
        }
        while (i<=m) {
            b[k++]=arr[i++];
        }
        while (j<=r) {
            b[k++]=arr[j++];
        }
        return swap;
    }
}
// Step 5
/*Summary of problem
 Not simple because of merge sort other wise quite simple

Approach (in your own words)
// Need to understand how you are going to use merge sort to get answer and how it runs
// remember as when arr is split into 2 then while doing sorting each step will give count of inversion if there so 
as per recursion rule don't go for debugging just take first step as sorted and if sorted the ans is mid-i+1.

"What I learned"
Great question ans can come from merge sort for inversion

“When to apply”*/