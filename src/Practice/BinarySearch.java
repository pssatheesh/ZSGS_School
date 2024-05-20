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
    //Using recursion

    static int RBS(int []arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<= arr[mid]){
            if(target>arr[start] && target<arr[mid]){
                return RBS(arr, target, start, mid-1);
            }else{
                return RBS(arr, target, mid+1, end);
            }
        }
        if(target>arr[mid] && target<arr[end]){
            return RBS(arr, target, start, mid-1);
        }
        return RBS(arr, target, mid+1, end);
    }
    public static void main(String[] args) {
        int []arr={5,6,7,8,9,10,11,12,13};
        System.out.println(search(arr, 10));
        System.out.println(RBS(arr, 9, 0, arr.length-1));

    }
}
