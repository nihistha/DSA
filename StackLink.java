public class StackLink {
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

    void push(int data){
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
    void pop(){
        Node newtail = head;
        if(head == null ){
            System.out.println("Stack underflow");
        }else{
            for(int i= 1;i<size-1;i++){
                newtail = newtail.next;
            }
            tail = newtail;
            tail.next = null;
            System.out.println("Data poped");
            size --;
        }
        
    }
    void peek(){
        Node temp = head;
        int i = size;
        while(i!=0){
            System.out.println(temp.data);
            temp = temp.next;
            i--;
        }
        // for(int i = 0;i<size;i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
    }
}
