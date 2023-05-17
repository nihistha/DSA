public class DoublyLinkedList {
    Node head = null;
    Node tail = null;
    int size  = 0;
    public static class Node{
        int data;
        Node next; // Stores address 
        Node prev; // Stores address \
        
        Node(int data){ // 
            this.data = data;
            next = prev = null;

        }
    }

    void insert(int data){
        Node newnode = new Node(data);
        if (head==null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        size ++;
    }
    
    void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    void reverse(){

        Node temp = head;
        Node temp2 = head;
        for (int i = 1;i<size;i++){
            if(temp.next ==null){
                temp.next = temp.prev;
                temp.prev = null;
            }else if(temp.prev == null){
                temp.prev = temp.next;
                temp.next = null;
            }else{
                temp.next = temp.prev;
                temp2.prev = temp2.next;

            }
            
            temp = temp.next;
            temp2 = temp2.next;
        }
        // head = temp ;
        // System.out.println(head.data);
        // return head;
    }

}
