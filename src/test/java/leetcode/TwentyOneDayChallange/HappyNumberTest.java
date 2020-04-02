package leetcode.TwentyOneDayChallange;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {
    HappyNumber happyNumber = new HappyNumber();

    @Test
    public void isHappy() {
        Assert.assertTrue(happyNumber.isHappy(19));
        Assert.assertFalse(happyNumber.isHappy(20));
        Assert.assertFalse(happyNumber.isHappy(1));
    }
}