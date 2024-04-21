package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class demo {
    public static String decodeSequence(String sequence) {
        int n = sequence.length();
        int[] nums = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            nums[i] = i + 1;
        }

        Stack<Integer> result = new Stack<>();

        for (int i = 0; i <= n; i++) {
            if (i == n || sequence.charAt(i) == 'I') {
                for (int j = i; j >= 0; j--) {
                    result.push(nums[j]);
                    if (j > 0 && (i == n || sequence.charAt(i) == 'I')) {
                        nums[j] = nums[j - 1];
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String sequence = "IIDDIDID";
        String decodedNumber = decodeSequence(sequence);
        System.out.println("Sequence: " + sequence);
        System.out.println("Output: " + decodedNumber);
    }
}
