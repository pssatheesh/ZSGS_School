import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void diagonalmatrix(int [][]arr){
        int len=arr.length, i=0, row, col;
        for(i=0;i<2*len;i++){
            row=(i<len)?0:i-len+1;
            col=(i<len)?i:len-1;
            while (row<len && col>=0){
                System.out.print(arr[row][col]+" ");
                row++;
                col--;
            }
            System.out.println();
        }
    }


    private static void spiralMatrix(int n) {
        int [][]arr=new int[n][n];
        int value=1;
        int minRows=0, maxRows=n-1;
        int minCols=0, maxCols=n-1;
        while(value<=n*n){
            for(int i=minCols;i<=maxCols;i++){
                arr[minRows][i]=value++;
            }
            for(int i=minRows+1;i<=maxRows;i++){
                arr[i][maxCols]=value++;
            }
            for(int i=maxCols-1;i>=minCols;i--){
                arr[maxRows][i]=value++;
            }
            for(int i=maxRows-1;i>minRows;i--){
                arr[i][minCols]=value++;
            }
            minRows++;
            maxRows--;
            minCols++;
            maxCols--;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private static void pattern(int n) {
        //first half
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //alphabet
            int ch=1;       //char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //second half
        for(int i=n-2;i>=0;i--){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //alphabet
            int ch=1;       //char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res1=new ArrayList<>();
        List<Integer> res2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            res1.add(nums1[i]);
            res2.add(nums2[i]);
        }
        System.out.println(res1);
        System.out.println(res2);
        ans.add(res1);
        ans.add(res2);
        return ans;
    }

    public static void main(String[] args) {
//        String s="this is 55my program";
//        System.out.println(s.matches("[0-9][a-z]"));
        int []arr[]={ {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        diagonalmatrix(arr);
        spiralMatrix(5);
        pattern(5);
        int []arr1={1,2,3,3};
        int []arr2={1,1,2,2};
        System.out.println(findDifference(arr1, arr2));

    }


}