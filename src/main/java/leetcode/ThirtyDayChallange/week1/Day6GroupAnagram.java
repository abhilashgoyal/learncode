package leetcode.ThirtyDayChallange.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * Week 1 Day 6 : https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3288/
 * Question:  https://leetcode.com/problems/group-anagrams/
 */
public class Day6GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) return result;

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = getSortedString(str);
            List<String> tempList = map.getOrDefault(key, new ArrayList<String>());
            tempList.add(str);
            map.put(key, tempList);
        }
        result.addAll(map.values());
        return result;
    }

    private String getSortedString(String input) {
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        StringBuilder result = new StringBuilder("");
        for (char c : inputArray) {
            result.append(c);
        }
        return result.toString();
    }
}
