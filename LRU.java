import java.util.HashMap;

public class LRU {
    Node head;
    Node tail;
    int capacity;
    LRU(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
    }
    HashMap<Integer,Node> map;
    public static class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
            prev = next = null;
        }
    }
    void insert(Node newnode){
        map.put(newnode.key,newnode);
        if (head==null){
            head = newnode;
            tail = newnode;
        }else{
            head.next = newnode;
            newnode.prev = head;
            head = newnode;
        }
    }
    void put(int key,int val){
        if(map.containsKey(key)){
            rem(map.get(key));
        }if(map.size()==capacity){
            rem(tail);
        }
        Node newnode = new Node(key,val); //newnode stores an address referencing the key and value object
        insert(newnode);

    }
    public int get(int key){
        Node node = map.get(key);
        if (node == null){
            return -1;
        }else{
            rem(node);
            insert(node);
            return node.val;
        }
    }
    public void rem(Node node){
        map.remove(node.key);
        if(node == head){
            Node temp = head;
            head = head.next;
            temp.next = null;
        }else if(node == tail){
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = node.prev = null;
        }
    }
}