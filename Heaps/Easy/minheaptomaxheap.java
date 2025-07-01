package Heaps.Easy;

public class minheaptomaxheap {
    public static void main(String[] args) {
        // Example min-heap (as an array)
        int[] minHeap = {1, 2, 3, 4, 5, 6, 7};
        
        System.out.println("Original Min-Heap:");
        for (int num : minHeap) {
            System.out.print(num + " ");
        }
        
        convertMinToMaxHeap(minHeap);
        
        System.out.println("\nConverted Max-Heap:");
        for (int num : minHeap) {
            System.out.print(num + " ");
        }
    }
    public static void convertMinToMaxHeap(int[] minHeap) {
        // Build a max-heap from the min-heap
        for (int i = (minHeap.length - 2) / 2; i >= 0; i--) {
            heapify(minHeap, minHeap.length, i);
        }
    }
    public static void heapify(int[] heap, int n, int i){
        int largest = i;
        int left = 2*i +1;
        int right = 2*i +2;
        if(left < n && heap[left] > heap[largest]){
            largest = left;
        }
        if(right<n && heap[right] > heap[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=heap[i];
            heap[i]=heap[largest];
            heap[largest]=temp;
            heapify(heap, n, largest);
        }
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//There's apattern in this one target the root nodes correct them with respect to its childs
//Then move to other main logic is the for loop how many to heapify.

"What I learned"
heapify

“When to apply”*/