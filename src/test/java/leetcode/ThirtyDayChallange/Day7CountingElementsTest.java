package leetcode.ThirtyDayChallange;

import leetcode.ThirtyDayChallange.week1.Day7CountingElements;
import org.junit.Assert;
import org.junit.Test;

public class Day7CountingElementsTest {

    Day7CountingElements ob = new Day7CountingElements();

    @Test
    public void countElements() {
        int[] input1 = {1, 2, 3};
        Assert.assertEquals(2, ob.countElements(input1));
        int[] input2 = {1, 1, 3, 3, 5, 5, 7, 7};
        Assert.assertEquals(0, ob.countElements(input2));
        int[] input3 = {1, 3, 2, 3, 5, 0};
        Assert.assertEquals(3, ob.countElements(input3));
        int[] input4 = {1, 1, 2};
        Assert.assertEquals(2, ob.countElements(input4));
        int[] input5 = {0, 0, 0, 0, 0, 0};
        Assert.assertEquals(0, ob.countElements(input5));
    }
}