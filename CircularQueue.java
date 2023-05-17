public class CircularQueue{
    int queue[];
    int size;
    int front = -1;
    int rear = -1;
    CircularQueue(int size){
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
            rear = (rear +1 )% size;
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
        int indxfront = front;
        front = (front + 1 )%size;
        return queue[indxfront];
    }

    boolean isFull(){
        return (rear +1)%size== front;
    }
    boolean isEmpty(){
        return rear == -1 && front == -1;
    }
} 
    

