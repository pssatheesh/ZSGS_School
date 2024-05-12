package Practice;

public class SinglyLinkedList {
    Node head;

    public void reverse() {
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;

    }


    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public SinglyLinkedList(){
        head=null;
    }
    public void insertAtBegining(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void display() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void insertAtPosition(int pos, int val) {
        if(pos==0){
            insertAtBegining(val);
            return;
        }
        Node temp=head;
        Node newNode=new Node(val);
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
}
