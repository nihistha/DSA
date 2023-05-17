public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next= null;
        }
    } 

    void insert(int data){
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
    void print(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;

        }
    }

    void getAtAnyPos(int pos){
        Node temp = head;
        if (pos == 1){
            System.out.println(head.data);
        }
        else if(pos==size){
            System.out.println(tail.data);
        }else{
            for(int i=1;i<size-1;i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    void remAtAnyPos(int pos){
        Node temp = head;
        Node prev = head;
        Node nodetoremove=null;
        if (pos == 1){
            head = temp.next;
        }else{
            for (int i = 1; i<pos-1;i++){
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
        // else{
        //     for (int i = 0 ; i <pos;i++){
        //         nodetoremove = temp.next;
        //     }
        //     temp.next=nodetoremove.next;
        //     nodetoremove.next=null;
        // }
        size--;
        System.out.println(size);
    }
}
