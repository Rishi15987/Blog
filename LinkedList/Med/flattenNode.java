package LinkedList.Med;


public class flattenNode {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);
        head.next = new Node(10);
        head.next.bottom = new Node(20);
        head.next.next = new Node(19);
        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);
        head.next.next.next = new Node(28);
        head.next.next.next.bottom = new Node(35);
        head.next.next.next.bottom.bottom = new Node(40);
        head.next.next.next.bottom.bottom.bottom = new Node(45);
        Node ans = flatten(head);
        while(ans!=null){
            System.out.println(ans.data);
            ans=ans.bottom;
        }
    }
    static class Node{
        int data;
        Node next;
        Node bottom;
        Node(int d){
            data=d;
            next=null;
            bottom=null;
        }
    }
    static Node flatten(Node root) {
        if(root == null || root.next==null){
            return root;
        }
        Node mergedNode = flatten(root.next);
        return merged(root, mergedNode);
    }
    public static Node merged(Node l1, Node l2){
        Node temp = new Node (-1);
        Node dummy = temp;
        while(l1 !=null && l2!= null){
            if(l1.data<l2.data){
                dummy.bottom=l1;
                l1=l1.bottom;
            }
            else{
                dummy.bottom=l2;
                l2=l2.bottom;
            }
            dummy=dummy.bottom;
            dummy.next=null;
        }
        if(l1!=null)dummy.bottom=l1;
        else dummy.bottom=l2;
        return temp.bottom;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//Man amazing question
Step 1: first use recursion so that you reach the end once you reached call merge the prev node and end node
In merge check l1 node and l2 node with data and whichever is small add in a dummy node once tow are merged then recursion will do rest because
your last l1 and l2 wil become l2 and another prev will become l1.

"What I learned"
New concept new question as well

“When to apply”*/