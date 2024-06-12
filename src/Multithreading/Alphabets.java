package Multithreading;

class Alpha implements Runnable {
    public void run(){
        for(char i='A';i<'Z';i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class number implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class Alphabets{
    public static void main(String[] args) {
        Alpha a=new Alpha();
        Thread t1=new Thread(a);
        number n=new number();
        Thread t2=new Thread(n);
        t1.start();
        try{
            t1.join(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}
