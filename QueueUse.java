public class QueueUse {

    public static void main(String[] args) {
        // System.out.println("Hello world ");

        QueueUsingArray q = new QueueUsingArray();
        // q.enqueue(0);
        // q.enqueue(1);
        // System.out.println(q.size());
        // System.out.println(q.front());
        // System.out.println(q.front());

        int arr[] = {10, 20, 30, 40};

        for(int elem : arr){
            q.enqueue(elem);
        }

        while(!q.isEmpty()){
            System.out.print(q.dequeue() + " ");
        }

        
    }
}
