public class QueueUsingArray {
    
    private int data[];
    private int front; // index of the element at the front of the q
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int elem){

        // if(size == data.length){
        //     throw new QueueFullException();
        // }

        if(size == 0){ 
            front++;
        }
        rear++;
        // if(rear == data.length){
        //     rear = 0;
        // }
        rear = (rear + 1) % data.length;
        data[rear] = elem;
        size++;
    }

    public int front() {
        // if(size == 0){
        //     System.out.println("Empty");
        //     throw new QueueEmptyException();
        // }
        return data[front];

    }
    public int dequeue(){

        // if(size == 0){
        //     System.out.println("empty");
        //     throw new QueueEmptyException();
        // }

        int ans = data[front];
        front++;
        // if(front == data.length){
        //     front = 0;
        // }
        front = (front + 1) % data.length;
        size--;
        if(size== 0){
            front = -1;
            rear = -1;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println("Hello world ");

        
    }
}
