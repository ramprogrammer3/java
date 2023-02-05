public class QueueUse {

    public static void main(String[] args) {
        // System.out.println("Hello world ");

        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(0);
        q.enqueue(1);
        System.out.println(q.size());
        System.out.println(q.front());
        // System.out.println(q.front());

        
    }
}
