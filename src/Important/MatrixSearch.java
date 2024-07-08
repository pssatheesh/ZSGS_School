package Important;

import java.util.ArrayList;
import java.util.List;

public class MatrixSearch {
    public static void main(String[] args) {
        List<List<int[]>> result = new ArrayList<>();
        String str = "OneTwoOneTwoOneTwoOne";
        String find = "woo";
        int wordLength = find.length();
        int size = (int) Math.ceil(Math.sqrt(str.length()));
        char[][] arr = new char[size][size];

        // Creating Matrix
        for (int i = 0, index = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (index < str.length())
                    arr[i][j] = str.charAt(index++);
                else
                    arr[i][j] = ' ';
            }
        }
        printMatrix(arr);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (checkChar(arr[i][j], find.charAt(0))) {
                    if (i + wordLength - 1 < size && j + wordLength - 1 < size) {
                        int ind = 0;
                        boolean match = true;
                        for (int m = i, n = j; m < i + wordLength && n < j + wordLength; m++, n++) {
                            if (!checkChar(arr[m][n], find.charAt(ind++))) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            List<int[]> temp = new ArrayList<>();
                            for (int m = i, n = j; m < i + wordLength && n < j + wordLength; m++, n++) {
                                temp.add(new int[]{m, n});
                            }
                            result.add(temp);
                        }
                    }
                    if (i + wordLength - 1 < size && j - wordLength + 1 >= 0) {
                        int ind = 0;
                        boolean match = true;
                        for (int m = i, n = j; m < i + wordLength && n >= j - wordLength + 1; m++, n--) {
                            if (!checkChar(arr[m][n], find.charAt(ind++))) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            List<int[]> temp = new ArrayList<>();
                            for (int m = i, n = j; m < i + wordLength && n >= j - wordLength + 1; m++, n--) {
                                temp.add(new int[]{m, n});
                            }
                            result.add(temp);
                        }
                    }
                    if (i - wordLength + 1 >= 0 && j + wordLength - 1 < size) {
                        int ind = 0;
                        boolean match = true;
                        for (int m = i, n = j; m >= i - wordLength + 1 && n < j + wordLength; m--, n++) {
                            if (!checkChar(arr[m][n], find.charAt(ind++))) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            List<int[]> temp = new ArrayList<>();
                            for (int m = i, n = j; m >= i - wordLength + 1 && n < j + wordLength; m--, n++) {
                                temp.add(new int[]{m, n});
                            }
                            result.add(temp);
                        }
                    }
                    if (i - wordLength + 1 >= 0 && j - wordLength + 1 >= 0) {
                        int ind = 0;
                        boolean match = true;
                        for (int m = i, n = j; m >= i - wordLength + 1 && n >= j - wordLength + 1; m--, n--) {
                            if (!checkChar(arr[m][n], find.charAt(ind++))) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            List<int[]> temp = new ArrayList<>();
                            for (int m = i, n = j; m >= i - wordLength + 1 && n >= j - wordLength + 1; m--, n--) {
                                temp.add(new int[]{m, n});
                            }
                            result.add(temp);
                        }
                    }
                    if (i + wordLength - 1 < size) {
                        int ind = 0;
                        boolean match = true;
                        for (int m = i; m < i + wordLength; m++) {
                            if (!checkChar(arr[m][j], find.charAt(ind++))) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            List<int[]> temp = new ArrayList<>();
                            for (int m = i; m < i + wordLength; m++) {
                                temp.add(new int[]{m, j});
                            }
                            result.add(temp);
                        }
                    }
                    if (i - wordLength + 1 >= 0) {
                        int ind = 0;
                        boolean match = true;
                        for (int m = i; m >= i - wordLength + 1; m--) {
                            if (!checkChar(arr[m][j], find.charAt(ind++))) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            List<int[]> temp = new ArrayList<>();
                            for (int m = i; m >= i - wordLength + 1; m--) {
                                temp.add(new int[]{m, j});
                            }
                            result.add(temp);
                        }
                    }
                    if (j + wordLength - 1 < size) {
                        int ind = 0;
                        boolean match = true;
                        for (int m = j; m < j + wordLength; m++) {
                            if (!checkChar(arr[i][m], find.charAt(ind++))) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            List<int[]> temp = new ArrayList<>();
                            for (int m = j; m < j + wordLength; m++) {
                                temp.add(new int[]{i, m});
                            }
                            result.add(temp);
                        }
                    }
                    if (j - wordLength + 1 >= 0) {
                        int ind = 0;
                        boolean match = true;
                        for (int m = j; m >= j - wordLength + 1; m--) {
                            if (!checkChar(arr[i][m], find.charAt(ind++))) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            List<int[]> temp = new ArrayList<>();
                            for (int m = j; m >= j - wordLength + 1; m--) {
                                temp.add(new int[]{i, m});
                            }
                            result.add(temp);
                        }
                    }
                }
            }
        }

        for (List<int[]> l : result) {
            for (int[] a : l) {
                System.out.print("(" + a[0] + "," + a[1] + ")");
            }
            System.out.println();
        }
    }

    private static void printMatrix(char[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean checkChar(char a, char b) {
        return a == b || a + 32 == b || a - 32 == b;
    }
}
