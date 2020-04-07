package leetcode.ThirtyDayChallange;

import leetcode.ThirtyDayChallange.week1.Day5BuySellStocksII;
import org.junit.Assert;
import org.junit.Test;

public class Day5BuySellStocksIITest {

    Day5BuySellStocksII ob = new Day5BuySellStocksII();

    @Test
    public void maxProfit() {
        int[] input1 = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(7, ob.maxProfit(input1));

        int[] input2 = {1, 2, 3, 4, 5};
        Assert.assertEquals(4, ob.maxProfit(input2));
    }
}