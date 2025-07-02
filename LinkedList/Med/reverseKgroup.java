package LinkedList.Med;

public class reverseKgroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode newhead = reverseKGroup(head, 2);
        while(newhead!=null){
            System.out.println(newhead.val);
            newhead=newhead.next;
        }
    }
    static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode tail = head;
        for(int i=0; i<k; i++){
            if(tail==null) return head;
            tail=tail.next;
        }
        ListNode newhead = reverse(head,tail);
        head.next = reverseKGroup(tail, k);
        return newhead;
    }
    public static ListNode reverse(ListNode curr, ListNode end){
        ListNode prev = null;
        while (curr!=end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }   
        return prev;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//Step 1: you need to iterate for 0 to k and reach a tail till k element.
Step 2 : Now just reverse the linked list from head to tail.
Step 3: when this is done use recusrion for each tail , k 

"What I learned"
//for reversing u need three prev curr and next no need to point all at once use loop point one to null
then again shift follow.

“When to apply”*/