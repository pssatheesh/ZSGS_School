package Practice.dataStructure;

public class StackImpleUsingArray<T> {
    static final int MAX_SIZE=30;
    T []arr;
    int top;
    public StackImpleUsingArray(){
        arr=(T[])new Object[MAX_SIZE];
        top=-1;
    }
    void push(T val){
        if(top==MAX_SIZE-1){
            throw new IndexOutOfBoundsException("Stack Overflow");
        }
        arr[++top]=val;
    }
    T pop(){
        if(top==-1){
            throw new IndexOutOfBoundsException("Stack underflow");
        }
        return arr[top--];
    }
    T peek(){
       return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
