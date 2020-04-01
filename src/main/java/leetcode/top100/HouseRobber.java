package leetcode.top100;

/**
 * https://leetcode.com/problems/house-robber/
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int nMinus1 = 0;
        int nMinus2 = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nMinus2 + nums[i], nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = max;
        }

        return max;
    }
}
