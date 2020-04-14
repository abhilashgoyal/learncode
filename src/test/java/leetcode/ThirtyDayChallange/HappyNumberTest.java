package leetcode.ThirtyDayChallange;

import leetcode.ThirtyDayChallange.week1.Day2HappyNumber;
import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {
    Day2HappyNumber happyNumber = new Day2HappyNumber();

    @Test
    public void isHappy() {
        Assert.assertTrue(happyNumber.isHappy(19));
        Assert.assertFalse(happyNumber.isHappy(20));
        Assert.assertTrue(happyNumber.isHappy(1));
    }
}