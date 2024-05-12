package Practice;


public class CircularLL<T> {
    Node last;
    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
    }
    public CircularLL(){
        last=null;
    }

    public void insertAtBegining(T data){
        Node newNode=new Node(data);
        if(last==null){
            newNode.next=newNode;
            last=newNode;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
    }
    public void display(){
        Node temp=last.next;
        do {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }while(temp!=last.next);
    }
    public T deleteBegining(){
        if(last==null){
            throw new IndexOutOfBoundsException();
        }
        T temp=last.next.data;
        if(last.next==null){
            return null;
        }else {
            last.next=last.next.next;
        }
        return temp;
    }
}
