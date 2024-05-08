package Leetcode;
/*Input: n = 5 a[] = {6,5,5,7,4}
Output:
15 */
public class SticklerThief198 {
    public static void main(String[] args) {
        int []a={2,1,1,2};
       int []res=new int[a.length];
        if(a.length==1)
            System.out.println(a[0]);

       if(a.length==2)
           System.out.println(Math.max(a[0], a[1]));
       res[0]=a[0];
       res[1]=Math.max(a[0], a[1]);
       for(int i=2;i<a.length;i++){
           res[i]=Math.max(res[i-2]+a[i], res[i-1]);
       }
        System.out.println(res[res.length-1]);
    }
}
