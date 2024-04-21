package ProgramContest1;

public class AgeCalculator {
    static int calculateDays(int []arr){
        int []start={1,1,1900};
        int noOfDays=0;
        int days=arr[0];
        int month=arr[1];
        int year=arr[2]-start[2];
        int []months={31,28,31,30,31,30,31,31,30,31,30,31};
        if((arr[2]%4==0 && arr[2]%100!=0) || (arr[2]%400==0)){
            months[1]=29;
        }
        int curr=0;
       for(int i=0;i<month-1;i++){
            curr+=months[i];
        }
        noOfDays=days+curr+(year*365)+(year/4);
        return noOfDays;
    }
    public static void main(String[] args) {
        int []dt1 = {1, 2, 2000};
        int []dt2 = {1, 2, 2004};
        int val1=calculateDays(dt1);
        int val2=calculateDays(dt2);
        System.out.println("No of days is "+(val2-val1));
    }
}
