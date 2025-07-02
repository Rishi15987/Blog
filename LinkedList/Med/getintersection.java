package LinkedList.Med;


import LinkedList.Med.addtwonumbers.ListNode;

public class getintersection {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;

        ListNode intersection = new getintersection().getIntersectionNode(headA, headB);
        System.out.println(intersection.val);
    }
    static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff = difference(headA, headB);
        if (diff<0){ while(diff++!=0){headB=headB.next;}}
        else while(diff--!=0){headA=headA.next;}

        while(headA != null){
            if(headA==headB) return headA;
            headB=headB.next;
            headA=headA.next;
        }
        return headA;
    }
    public static int difference(ListNode headA, ListNode headB){
        int len1=0, len2=0;
        while(headA != null || headB!= null){
            if(headA!=null){
                headA=headA.next;
                ++len1;
            }
            if(headB!=null){
                headB=headB.next;
                ++len2;
            }
        }
        return len1-len2;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//see u may think of using fast slow but use the difference in length
// see when you have diff you can use if its - or + as per that you can reach at same starting point when reached 
can easily find intersection.

"What I learned"


“When to apply”*/