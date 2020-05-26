public class QueueArray {

    int capacity;
    int queueArr [];
    int front;
    int rear;
    int currentSize;

    public QueueArray(int sizeofQueue){
        this.capacity = sizeofQueue;
        front = 0;
        rear = -1;
        queueArr = new int[capacity];
    }

    public boolean isFull(){
        if(currentSize == capacity){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(currentSize == 0){
            return true;
        }
        return false;
    }

    /** FIFO (First In First Out)
     * Font: is used to remove the data
     * Rear: is used to add the data
     * This method used to Add element into the queue
     * @param data
     */
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            rear++;
            if(rear ==capacity-1){
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data+" added to Queue");
        }
    }

    /**
     * This method used to remove element from the font of the queue
     */
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else {
            //queueArr[front] = int data;
            //System.out.println(data + " deleted from Queue");
            front++;
            if (front == capacity-1){
                System.out.println(queueArr[front-1]+ " removed from queue");
                front = 0;
            }else {
                System.out.println(queueArr[front-1]+ " removed from queue");
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {
        QueueArray qa = new QueueArray(10);
        qa.dequeue();
        qa.enqueue(10);
        qa.enqueue(20);
        qa.dequeue();
        System.out.println(qa.isEmpty());
        System.out.println(qa.isFull());
        qa.enqueue(30);
        qa.dequeue();

        qa.enqueue(40);
        qa.enqueue(50);
        qa.dequeue();
        qa.enqueue(60);
        qa.dequeue();

    }
}
