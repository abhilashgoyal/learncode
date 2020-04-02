package leetcode.ThirtyDayChallange;

import org.junit.Assert;
import org.junit.Test;


public class Day1SingleNumberTest {
    Day1SingleNumber day1SingleNumber = new Day1SingleNumber();

    @Test
    public void singleNumber() {
        int[] input1 = {2, 2, 1};
        Assert.assertEquals(1, day1SingleNumber.singleNumber(input1));

        int[] input2 = {4, 1, 2, 1, 2};
        Assert.assertEquals(4, day1SingleNumber.singleNumber(input2));
    }
}