package IOpratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        String src="C:/Users/Lucky Dell/Desktop/sample.txt";
        String dst="C:/Users/Lucky Dell/Desktop/copy.txt";
        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(dst);
        int value=fis.read();
        while(value!=-1){
            fos.write(value);
            value=fis.read();
        }
        System.out.println("completed");
    }
}
