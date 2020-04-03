package leetcode.ThirtyDayChallange;

/**
 * Week 1 Day 2 : https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3285/
 * Question:  https://leetcode.com/problems/maximum-subarray/
 */
public class Day3MaxSubArray {

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        for (int i = 0; i < nums.length; i++) {
            tempSum += nums[i];
            maxSum = Math.max(tempSum, maxSum);
            if (tempSum < 0) {
                // reinitialize the tempSum if it is negative
                tempSum = 0;
            }
        }

        return maxSum;
    }
}
