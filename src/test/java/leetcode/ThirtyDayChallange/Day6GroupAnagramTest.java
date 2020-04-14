package leetcode.ThirtyDayChallange;

import leetcode.ThirtyDayChallange.week1.Day6GroupAnagram;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class Day6GroupAnagramTest {
    Day6GroupAnagram ob = new Day6GroupAnagram();

    @Test
    public void groupAnagrams() {
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ob.groupAnagrams(input1);
        Assert.assertTrue(true);
    }
}