package leetcode.top100;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {

    HouseRobber houseRobber = new HouseRobber();

    @Test
    public void rob() {
        int [] input1 = {2,7,9,3,1};
        Assert.assertEquals(12, houseRobber.rob(input1));

        int [] input2 = {2,1};
        Assert.assertEquals(2, houseRobber.rob(input2));

        int [] input3 = {1,2,3,1};
        Assert.assertEquals(4, houseRobber.rob(input3));
    }
}