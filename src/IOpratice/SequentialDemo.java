package IOpratice;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequentialDemo {
    public static void main(String[] args) {
        try{
            String src="C:/Users/Lucky Dell/Desktop/sample.txt";
            String dst="C:/Users/Lucky Dell/Desktop/copy.txt";
            byte []arr="Good Morning, Vetri venduma pottu parrada ethineechal".getBytes();
            ByteArrayInputStream bis=new ByteArrayInputStream(arr);

            FileInputStream fis=new FileInputStream(src);
            SequenceInputStream sis=new SequenceInputStream(fis, bis);
            FileOutputStream fos=new FileOutputStream(dst);
            int value=sis.read();
            while(value!=-1){
                fos.write(value);
                value=sis.read();
            }
            System.out.println("Bytes to file converted");
            bis.close();
            fis.close();
            sis.close();
            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
