package LinkedList.Med;

public class rotateLDaboutK {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ListNode newhead = rotateRight(head, k);
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
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode temp = head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        if(k==0) return head;
        temp.next=head;
        ListNode tail = head;
        for(int i=0; i<len-k-1; i++){
            tail=tail.next;
        }
        ListNode newhead = tail.next;
        tail.next=null;
        return newhead;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Easy only only one approach is there to think but one thing may change 
you want to use len-k or len%k

"What I learned"


“When to apply”*/