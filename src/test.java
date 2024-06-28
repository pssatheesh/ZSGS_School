import java.util.Arrays;

public class test {
    int a;float fl; double d;
    public static void main(String[] args) {

        int []a= {1,2,3};
//        int []clonearr=a.clone();
//        System.out.println(a[0]==clonearr[0]);
//        a[1]=21;
//        System.out.println(a[1]==clonearr[1]);
//        System.out.println(a.length);
        System.out.println(Arrays.binarySearch(a,2));

    }


}
