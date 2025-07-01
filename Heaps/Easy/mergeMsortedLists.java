package Heaps.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeMsortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        
        ListNode[] lists = {l1, l2, l3};
        ListNode merged = mergeKLists(lists);
        
        System.out.println("Merged list:");
        printList(merged);
    }
     public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists== null || lists.length==0) return null;

        List<ListNode> flist = new ArrayList<ListNode>(Arrays.asList(lists));
        while(flist.size()>1){
            List<ListNode> merged = new ArrayList<ListNode>();
            for(int i=0; i<flist.size(); i+=2){
                ListNode l1 = flist.get(i);
                ListNode l2 = (i+1<flist.size())? flist.get(i+1): null;
                merged.add(mergeTwoList(l1,l2));
            }
            flist=merged;
        }
        return flist.get(0);
    }
    public static ListNode mergeTwoList (ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

       while(l1!=null && l2 != null) {
        if(l1.val<=l2.val){
            temp.next=l1;
            l1=l1.next;
        }
        else{
            temp.next=l2;
            l2=l2.next;
        }
        temp=temp.next;
       }
       temp.next = (l1!=null)? l1 : l2;
       return dummy.next;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// time taking but easy split in two steps
1. pull to lists at a time and merge them as they sorted its very easy
2. while merginf check edge cases if odd then need to handle each time 2 are merged so.

"What I learned"
Amazing question and good logic

“When to apply”*/