public class QueueLink {
    Node head =null;
    Node tail = null;
    int size;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    void enqueue(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            tail = newnode;
        }
        size ++;
    }
    void dequeue(){
        Node temp = head;
        if(head == null ){
            System.out.println("stackunderfowl");
        }else{
            System.out.println("data poped: "+ head.data);
            head = temp.next;
            size--;
        }

    }
}
