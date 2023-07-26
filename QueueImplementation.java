public class QueueImplementation {
    public static void main(String[] args) {
        Queues q = new Queues(5);
        q.enqueue(10);
        q.enqueue(33);
        q.enqueue(43);
        System.out.println(q.dequeue()); 
    }
}
