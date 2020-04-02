package leetcode.TwentyOneDayChallange;

import java.util.HashSet;

/**
 * Week 1 Day 2 : https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3284/
 * Question: https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        boolean result = false;
        HashSet<Integer> existingNumbers = new HashSet<>();
        while (true) {
            int nextN = getNexNumber(n);
            // start repeating
            if (existingNumbers.contains(nextN)) {
                break;
            } else if (nextN == 1) {
                // we have hit base condition
                result = true;
                break;
            } else {
                // repeat the process
                n = nextN;
                existingNumbers.add(nextN);
            }
        }
        return result;
    }

    /**
     * returns Sum Of Square of each digit of input n
     *
     * @param n
     * @return
     */
    private int getNexNumber(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return sum;
    }
}
