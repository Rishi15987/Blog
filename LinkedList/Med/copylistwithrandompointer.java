package LinkedList.Med;

public class copylistwithrandompointer {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head.next;
        Node newhead = copyRandomList(head);
        while(newhead!=null){
            System.out.println(newhead.val);
            newhead=newhead.next;
        }
    }
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyRandomList(Node head) {
        if (head==null) return head;
        Node curr = head;
        while(curr!=null){
            Node newnode = new Node(curr.val);
            newnode.next=curr.next;
            curr.next=newnode;
            curr=newnode.next;
        }
        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
                curr=curr.next.next;
            }
        }
        curr = head;
        Node newhead = head.next;
        Node newcurr= newhead;
        while(curr!=null){
            curr.next=newcurr.next;
            curr=curr.next;
            if(curr!=null){
                newcurr.next = curr.next;
                newcurr=newcurr.next;
            }
        }
        return newhead;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//See create a copy of node of all not just seperate do it like suppose it starts with 4 then create 4 new 
then assign previous 4 next to new 4 then new 4 to prev 4's next like 5
example if arr is 4 8 5 6 then final will be 4 4 8 8 5 5 6 6
Now copy the random assign one by one for new 
Now both next and random is copied
Now break the chain connect old 4 with its 8 thrn 5 6 same for new.
Like this because you can use while and you will have location stored 


"What I learned"


“When to apply”*/