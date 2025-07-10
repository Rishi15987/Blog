package LinkedList.Med;

public class reorderlist {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        reorderList(head);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode h2=slow.next;
        slow.next=null;
        ListNode curr = h2;
        ListNode prev = null;
        while(curr!=null){
            ListNode newnext = curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnext;
        }
        ListNode t1=head;
        ListNode t2=prev;
        while(t2!=null){
            ListNode m1=t1.next;
            ListNode m2=t2.next;
            t1.next=t2;
            t2.next=m1;
            t1=m1;
            t2=m2;
        }

    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
So for doing in 0 space what to do
if you will use pen then u will see if u break from middle and reverse the last part
then what you need to do is point one to other one then other to other
how to do take 2 pointer in each head keep shifting after assigning

"What I learned"
A whole lot of thing.

“When to apply”*/