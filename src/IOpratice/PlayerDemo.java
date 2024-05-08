package IOpratice;

import java.io.IOException;

public class PlayerDemo {
    public static void main(String[] args) throws Exception {
        String src="C:/Users/Lucky Dell/Desktop/copy.txt";
        Runtime rt=Runtime.getRuntime();
        System.out.println(rt);
        String control="open notepad "+src;
        Process p=rt.exec(control);

    }
}
