public class Queues{
    int queue[];
    int size;
    int front = -1;
    int rear = -1;
    Queues(int size){
        this.size = size;
        queue = new int[size];
    }
    void enqueue(int data){
        if (isFull()){
            System.out.println("queue overflow");
        }else{
            if(front == -1){
                front= 0;
            }
            rear++;
            queue[rear] = data;
        }
    }
    int dequeue (){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -99999;
        }
        if (rear == front){
            int temp = queue[front];
            front = rear = -1;
            return queue[temp];
        }
        return queue[front++];
    }

    boolean isFull(){
        return rear == size -1;
    }
    boolean isEmpty(){
        return rear == -1 && front == -1;
    }
}