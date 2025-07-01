package LinkedList.Med;

import LinkedList.Med.removeNfromlast.ListNode;

public class addtwonumbers {
    public static void main(String[] args) {
        
    }
    static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry =0;
        while(l1!=null || l2!=null || carry==1){
            int sum =0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//so 1st thought came as make the data by iterating in string then in int then add but that's long
// So do this what if one by one data we extract and add ultimately we r doing same but here if sum>9 then we need to carry 1 or 2 wha ever it is
need to handle that when it should go in sum while in loop it should go at the end if its left then make one node.
Thtas' it

"What I learned"


“When to apply”*/