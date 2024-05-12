package IOpratice;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class ByteArrayDemo {
    public static void main(String[] args) {
        String dst="C:/Users/Lucky Dell/Desktop/copy.txt";
        try{
            byte []arr="Good Morning, Vetri venduma pottu parrada ethineechal".getBytes();
            ByteArrayInputStream bis=new ByteArrayInputStream(arr);
            FileOutputStream fos=new FileOutputStream(dst);
            int value=bis.read();
            while(value!=-1){
                fos.write(value);;
                value=bis.read();
            }
            System.out.println("Bytes to file converted");

            fos.close();
            bis.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
