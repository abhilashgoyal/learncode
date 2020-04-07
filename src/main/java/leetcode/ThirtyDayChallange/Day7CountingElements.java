package leetcode.ThirtyDayChallange;

import java.util.HashMap;
import java.util.Map;

/**
 * Week 1 Day 7 : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3289/
 */
public class Day7CountingElements {

    public int countElements(int[] arr) {
        int sum = 0;
        if (arr == null || arr.length == 0) return sum;

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int x : arr) {
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            if (countMap.containsKey(key + 1)) sum += entry.getValue();
        }

        return sum;
    }
}
