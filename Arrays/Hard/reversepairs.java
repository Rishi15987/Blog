package Arrays.Hard;

public class reversepairs {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
        System.out.println(reversePairs(arr));
    }
    public static int reversePairs(int[] arr) {
        int cnt=0;
        cnt=mergesort(arr,0, arr.length-1);
        return cnt;
    }
    public static int mergesort(int arr[],int l,int r){
        int cnt = 0;
        if (l >= r) return cnt;
        int mid = l+(r-l)/2 ;
        cnt += mergesort(arr, l, mid);  // left half
        cnt += mergesort(arr, mid + 1, r); // right half
        cnt += countPairs(arr, l, mid, r);
        sort(arr, l, mid, r);  // merging sorted halves
        return cnt;
    }
    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid+1;
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2*(long)arr[right]){
                right++;
            }
            cnt+=(right-(mid+1));
        }
        return cnt;
    }
    public static int sort(int arr[],int l, int mid, int r){
        int cnt=0;
        int b[] = new int[r-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                b[k]=arr[i];
                i++;
            }
            else {
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            b[k]=arr[i];
            i++;
            k++;
        }
        while (j<=r){
            b[k]=arr[j];
            j++;
            k++;
        }
        for (int z = 0; z < b.length; z++) {
            arr[l + z] = b[z];
        }
        return cnt;
    }
}
