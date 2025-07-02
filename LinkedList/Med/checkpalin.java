package LinkedList.Med;

public class checkpalin {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
    static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode sl = findMiddle(head);
        ListNode newhead = reverseLinkedList(sl);
        ListNode first = head;
        ListNode second = newhead;
        while (second!= null){
            if(first.val!=second.val){
                return false;
            }
            first= first.next;
            second=second.next;
        }
        return true;
    }
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode reverseLinkedList(ListNode head){
        if(head==null || head.next==null){
        return head;
    }
        ListNode newhead= reverseLinkedList(head.next);
        ListNode headnext = head.next;
        headnext.next=head;
        head.next=null;
        return newhead;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//GO with you thought just reverse it and check one by one 
// TO shprten it more reverse only half part much optimized.

"What I learned"
Not much just revision.

“When to apply”*/