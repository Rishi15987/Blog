package LinkedList.Easy;


public class reverseLD {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode newhead = new reverseLD().reverseList(head);
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
    public ListNode reverseList(ListNode head) {
    if(head==null || head.next==null){
        return head;
    }
    ListNode newhead= reverseList(head.next);
    ListNode headnext = head.next;
    headnext.next=head;
    head.next=null;
    return newhead;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// see 1st thought should better reach end how to reach always recursion so after reaching u get last head then start reversing previous
head to last head and then prev head to  null

"What I learned"
Revision + when to use head= head.next and when to use only head.next. very crusial role


“When to apply”*/