package Practice;

/*Given a two dimensional array of string like

  <”luke”, “shaw”>
  <”wayne”, “rooney”>
  <”rooney”, “ronaldo”>
  <”shaw”, “rooney”>
Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to
find his no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.*/
public class Grandchild {
    public static void main(String[] args) {
        String str[][]={{"luke"  , "shaw"},
                {"wayne" , "rooney"},
                {"rooney", "ronaldo"},
                {"shaw"  , "rooney"},
                {"mary", "wayne"}};

        String target = "rooney";
        int grandchld =0;
        for(int i=0;i<str.length;i++){
            if(str[i][1].equals(target))
                grandchld+=findchild(str, str[i][0]);

        }
        System.out.println(grandchld);
    }
    private static int  findchild(String [][]str, String target){
        int count=0;
        for(int i=0;i< str.length;i++){
            if(str[i][1].equals(target)){
                count++;
            }
        }
        return count;
    }
}
