package leetcode.TwentyOneDayChallange;

/**
 * These codes are part of Leetcode 21 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3283/
 */
public class Day1SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
