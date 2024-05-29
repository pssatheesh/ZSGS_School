package Leetcode;

public class L5_LongestPalindrome {
    private static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();

        String LPS = "";

        for (int i = 1; i < s.length(); i++) {

            // Consider odd length
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == s.length())
                    break;
            }

            String palindrome = s.substring(low+1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }

            // Consider even length
            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == s.length())
                    break;
            }

            palindrome = s.substring(low+1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }

        return LPS.length();
    }

    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
