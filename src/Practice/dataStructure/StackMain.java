package Practice.dataStructure;

public class StackMain {
    public static void main(String[] args) {
        StackImpleUsingArray<Integer> stack=new StackImpleUsingArray();
        stack.push(23);
        stack.push(12);
        stack.push(11);
        System.out.println("popped value:"+stack.pop());
        System.out.println("Popped value:"+stack.pop());
        System.out.println("Popped value:"+stack.pop());
       // System.out.println("Popped value:"+stack.pop());
        stack.push(12);
        stack.push(11);
        System.out.println("Popped value:"+stack.pop());
        System.out.println("Popped value:"+stack.pop());

        System.out.println("-------USING LL-------");
        StackImpUsingLL<Integer> sl=new StackImpUsingLL<>();
        sl.push(9);
        sl.push(23);
        System.out.println(sl.pop());
        System.out.println(sl.pop());
        sl.push(34);
        System.out.println(sl.pop());
        System.out.println(sl.isEmpty());
    }
}
