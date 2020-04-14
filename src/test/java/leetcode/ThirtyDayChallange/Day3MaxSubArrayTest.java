package leetcode.ThirtyDayChallange;

import leetcode.ThirtyDayChallange.week1.Day3MaxSubArray;
import org.junit.Assert;
import org.junit.Test;

public class Day3MaxSubArrayTest {
    Day3MaxSubArray day3MaxSubArray = new Day3MaxSubArray();

    @Test
    public void maxSubArray() {
        int[] input1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, day3MaxSubArray.maxSubArray(input1));

        int[] input2 = {-1, -2, -3, -4};
        Assert.assertEquals(-1, day3MaxSubArray.maxSubArray(input2));
    }
}