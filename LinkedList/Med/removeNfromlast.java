package LinkedList.Med;


public class removeNfromlast {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode newhead = new removeNfromlast().removeNthFromEnd(head,2);
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp = slow.next;
        slow.next=slow.next.next;
        temp=null;
        return dummy.next;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//When u see this question you just try to reach the n-1 node and n node then rest u can do easily but
reaching there is little tricky.
take two sample heads push one head till n and then until this get null push both heads. Thas's it


"What I learned"


“When to apply”*/