package Leetcode;

public class JumpGameL55 {
    private static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 1, 4};
        System.out.println(canJump(arr));
    }
}
