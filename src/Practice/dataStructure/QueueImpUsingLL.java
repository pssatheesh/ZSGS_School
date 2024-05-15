package Practice.dataStructure;

public class QueueImpUsingLL<T> {
    class Node{
        Node next;
        T data;
        public Node(T val){
            data=val;
            next=null;
        }
    }
   Node front, rear;
    public QueueImpUsingLL(){
        front=null;
        rear=null;
    }
    public void enqueue(T val){
        Node newNode=new Node(val);
        if(front==null){
            front=newNode;
        }else{
            rear.next=newNode;
        }
        rear=newNode;
    }
    public T dequeue(){
        if(front==null){
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        T temp=front.data;
        front=front.next;
        if(front==null){ // Only one method to check this
            rear=null;
        }
        return temp;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public T getFrontElement(){
        if(front==null){ // Only one method to check this
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        return front.data;
    }
}
