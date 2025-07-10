package Binarysearch.Hard;

public class matrixmedian {
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{2,4,6,8},{2,3,5,9}};
        System.out.println(median(matrix));
    }
    static int median(int matrix[][]) {
        int low =Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++){
            low = Math.min(low,matrix[i][0]);
            high = Math.max(high, matrix[i][n-1]);
        }
        int req = n*m/2;
        while(low<=high){
            int mid = low+(high-low)/2;
            int smallequal = countsmallequal(matrix,m,n,mid);
            if(smallequal<=req){
                low = mid+1;
            }
            else high=mid-1;
        }
        return low;
    }
    public static int countsmallequal(int matrix[][], int m, int n, int x){
        int cnt=0;
        for(int i=0;i<m;i++){
            cnt+=upperbound(matrix[i],n,x);
        }
        return cnt;
    }
    public static int upperbound(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=x){
                low = mid+1;
            }
            else{
                 high=mid-1;
                 ans=mid;
            }
        }
        return ans;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Amazing question main concept is here upperbound so better watch striver's video.
Once undertood easy only.


"What I learned"


“When to apply”*/