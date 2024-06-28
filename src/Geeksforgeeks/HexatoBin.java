package Geeksforgeeks;

public class HexatoBin {
    private static String convertHexatoBinary(String input){
        StringBuilder result=new StringBuilder();
        for (int i=0;i<input.length();i++){
            int dec=Integer.parseInt(String.valueOf(input.charAt(i)), 16);

            while(dec>0){
                result.append(dec%2);
                dec/=2;
            }
        }
        return result.reverse().toString();
    }
    private static void convertHexatoBinary(char []arr) {
        int i=0;
        while (arr[i] != '\u0000') {

            switch (arr[i]) {
                case '0':
                    System.out.print("0000");
                    break;
                case '1':
                    System.out.print("0001");
                    break;
                case '2':
                    System.out.print("0010");
                    break;
                case '3':
                    System.out.print("0011");
                    break;
                case '4':
                    System.out.print("0100");
                    break;
                case '5':
                    System.out.print("0101");
                    break;
                case '6':
                    System.out.print("0110");
                    break;
                case '7':
                    System.out.print("0111");
                    break;
                case '8':
                    System.out.print("1000");
                    break;
                case '9':
                    System.out.print("1001");
                    break;
                case 'A':
                case 'a':
                    System.out.print("1010");
                    break;
                case 'B':
                case 'b':
                    System.out.print("1011");
                    break;
                case 'C':
                case 'c':
                    System.out.print("1100");
                    break;
                case 'D':
                case 'd':
                    System.out.print("1101");
                    break;
                case 'E':
                case 'e':
                    System.out.print("1110");
                    break;
                case 'F':
                case 'f':
                    System.out.print("1111");
                default:
                    System.out.print("\nInvalid hexadecimal digit " + arr[i]);
            }
            i++;
        }

    }
    public static void main(String[] args) {
        String str="1AC5";
        System.out.println(convertHexatoBinary(str));
        char []arr;
        arr=str.toCharArray();
        try{
            convertHexatoBinary(arr);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("");
        }

    }
}
