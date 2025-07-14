package StackQueues.Hard;

import java.util.HashMap;
import java.util.Map;

public class lrucache {
    public static void main(String[] args) {
        
    }
}
class LRUCache {
    Map<Integer,Node> map;
    private int cap;
    private Node head;
    private Node tail;

    public LRUCache(int capacity){
        this.cap=capacity;
        this.map=new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }

    public void deletenode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    public void afterhead(Node node){
        Node after = head.next;
        head.next=node;
        node.next=after;
        node.prev=head;
        after.prev=node;
    }
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        deletenode(node);
        afterhead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val=value;
            deletenode(node);
            afterhead(node);
        }
        else{
            if(map.size()==cap){
                Node node = tail.prev;
                map.remove(node.key);
                deletenode(node);
            }
            Node node = new Node(key,value);
            map.put(key,node);
            afterhead(node);
        }
    }
}
class Node{
    int key;
    int val;
    Node next;
    Node prev;

    public Node(int key, int value){
        this.key=key;
        this.val=value;
        this.next=null;
        this.prev=null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// Step 5
/*Summary of problem


Approach (in your own words)
Hard level question it is see if you know the logic what to use then its east break it into parts


"What I learned"


“When to apply”*/