package Practice;

public class BinarySearch {
    public static int search(int []arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean asc=false;
        if(arr[start]<arr[end]){
            asc=true;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(asc){    //ascending order
                if(target>arr[mid]){
                    start=mid+1;
                }else if(target<arr[mid]){
                    end=mid-1;
                }else{
                    return mid;
                }
            }else { //decending order
                if(target>arr[mid]){
                    end=mid-1;
                }else if(target<arr[mid]){
                    start=mid+1;
                }else{
                    return mid;
                }
            }


        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={5,6,7,8,9,10,11,12,13};
        System.out.println(search(arr, 10));

    }
}
