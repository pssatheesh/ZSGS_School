package Important;

public class flower {
    public static void main(String[] args) {
        String []arr={"flower", "flow", "flight"};
        int minLength=arr[0].length(), commonlength=0;
        for(int i=1;i< arr.length;i++){
            if(arr[i].length()<minLength)
                minLength=arr[i].length();
        }
        for(int i=0;i<minLength;i++){
            boolean check=true;
            char ch=arr[0].charAt(i);
            for(int j=0;j<arr.length;j++){
                if(arr[j].charAt(i)!=ch){
                    check=false;
                    break;
                }
            }
            if(check)
                commonlength++;
        }
        for(int i=0;i<commonlength;i++){
            System.out.print(arr[0].charAt(i));
        }
    }
}
