package ProgramContest1;

public class Program9 {
    public static void main(String[] args) {
        int []arr= {16, 17, 4, 3, 5, 2};
        int max=arr[arr.length-1];
        System.out.println(max);
        for(int i=arr.length-2;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}
