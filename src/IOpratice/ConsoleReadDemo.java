package IOpratice;

import java.io.FileOutputStream;

public class ConsoleReadDemo {
    public static void main(String[] args) {
        String dst="C:/Users/Lucky Dell/Desktop/copy.txt"; //ctrl + d to out from the input
        try{
            FileOutputStream fos=new FileOutputStream(dst);
            int value=System.in.read();
            while(value!=-1){
                fos.write(value);
                value=System.in.read();
            }
            System.out.println("Input readed from keyboard completed");

            System.in.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
