public class Queue{
    int front, rear, capacity;
        int[] queue;
        Queue(int size){
            front = rear = 0;
            capacity = size;
            queue = new int[capacity];
        }
        void Enqueue(int element){
            //check if queue is full
            if(capacity == rear){
                System.out.println("queue is full");
            }
            else{
                //insert element in the end of queue
                queue[rear] = element;
                rear++;
            }
        }
        void Dequeue(){
            if(front == rear){
                System.out.println("Queue is already empty");
            }
            else{
                //shift all the elements to the right
                for(int i=0; i < rear - 1; i++){
                    queue[i] = queue[i+1];
                }
                if(rear<capacity){
                    queue[rear] = 0;
                }
                rear--;
            }
        }
        void displayQueue(){
            for(int i=0; i<= rear-1; i++){
                System.out.println(queue[i]);
            }
        }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.Enqueue(5);
        queue.Enqueue(10);
        queue.Enqueue(15);
        queue.displayQueue();
    }
}