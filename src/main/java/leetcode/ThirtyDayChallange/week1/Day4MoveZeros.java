package leetcode.ThirtyDayChallange.week1;

/**
 * Week 1 Day 4 : https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3286/
 * Question:  https://leetcode.com/problems/move-zeroes/
 */

public class Day4MoveZeros {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
