package Practice.dataStructure;

public class StackImpUsingLL<T> {
    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
    }
    Node top;
    public StackImpUsingLL(){
        top=null;
    }
    public void push(T val){
        Node newNode=new Node(val);
        newNode.next=top;
        top=newNode;
    }
    public T pop(){
        if(top==null)
            throw new IndexOutOfBoundsException("Stack is empty");
        T temp=top.data;
        top=top.next;
        return temp;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public T peek(){
        return top.data;
    }
}
