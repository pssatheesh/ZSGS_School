import java.util.HashMap;
import java.util.Map;

public class test {
    public static String findSmallestSubstring(String word, String sentence) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        int n = word.length();
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        String smallestSubstring = "";

        for (char c : word.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        while (i < sentence.length()) {
            char currentChar = sentence.charAt(i);

            if (charCountMap.containsKey(currentChar)) {
                if (charCountMap.get(currentChar) > 0) {
                    n--;
                }
                charCountMap.put(currentChar, charCountMap.get(currentChar) - 1);
            }

            while (n == 0) {
                int currentLength = i - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    smallestSubstring = sentence.substring(left, i + 1);
                }

                char leftChar = sentence.charAt(left);
                if (charCountMap.containsKey(leftChar)) {
                    charCountMap.put(leftChar, charCountMap.get(leftChar) + 1);
                    if (charCountMap.get(leftChar) > 0) {
                        n++;
                    }
                }

                left++;
            }

            i++;
        }

        return smallestSubstring;
    }

    public static void main(String[] args) {
        String word = "ABC";
        String sentence = "ADOBECODEBANC";

        String result = findSmallestSubstring(word, sentence);
        System.out.println("Smallest Substring: " + result);
    }
}
