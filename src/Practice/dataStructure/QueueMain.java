package Practice.dataStructure;

public class QueueMain {
    public static void main(String[] args) {
        QueueImpleArray q=new QueueImpleArray();
        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println("Dequeued :"+q.dequeue());
        System.out.println("Dequeued :"+q.dequeue());
        System.out.println("Dequeued :"+q.dequeue());
//        System.out.println("Dequeued :"+q.dequeue());


        System.out.println("---------------QueueImpUsingLL-----------");
        QueueImpUsingLL<Integer> ql=new QueueImpUsingLL<>();
        //System.out.println(ql.dequeue());
        ql.enqueue(5);
        ql.enqueue(67);
        ql.enqueue(20);
        System.out.println(ql.dequeue());
        System.out.println(ql.dequeue());

    }
}
