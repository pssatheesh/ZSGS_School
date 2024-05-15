package Practice.dataStructure;

public class QueueImpleArray {
    //First in First Out
    //Enqueue add to the element in last and Dequeue del element from the first
    static final int MaxSize=30;
    int []arr;
    int front, rear;
    public QueueImpleArray(){
        arr=new int[MaxSize];
        front=-1;
        rear=-1;
    }
    public void enqueue(int val){
        if(rear==MaxSize-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(front==-1) front++;
        arr[++rear]=val;
    }
    public int dequeue(){
        if(front==-1 || front>rear)
            throw new IndexOutOfBoundsException("Queue is Empty");
        return arr[front++];
    }

}
