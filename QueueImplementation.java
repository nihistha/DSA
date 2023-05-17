public class QueueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(33);
        q.enqueue(43);
        System.out.println(q.dequeue()); 
    }
}
