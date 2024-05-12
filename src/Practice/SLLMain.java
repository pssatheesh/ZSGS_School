package Practice;

public class SLLMain {
    public static void main(String[] args) {
        SinglyLinkedList s=new SinglyLinkedList();
        s.insertAtBegining(5);
        s.insertAtBegining(9);
        s.display();
        s.insertAtPosition(1,5);
        s.reverse();
        s.display();

        System.out.println("\n");
        CircularLL c=new CircularLL();
        c.insertAtBegining("Satheesh");
        c.insertAtBegining("Ram");
        c.insertAtBegining("Devil");
        c.display();
        c.deleteBegining();
        c.display();
    }
}
