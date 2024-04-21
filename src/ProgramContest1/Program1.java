package ProgramContest1;

public class Program1 {
    static int maxProfit(int []arr){
        int maxProfit=0;
        int minPrice=arr[0];
        if(arr.length<2){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            minPrice=Math.min(minPrice, arr[i]);
            maxProfit=Math.max(maxProfit, arr[i]-minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int []arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
