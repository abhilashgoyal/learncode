package leetcode.ThirtyDayChallange.week1;

/**
 * Week 1 Day 5 : https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3287/
 * Question:  https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class Day5BuySellStocksII {

    public int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] <= prices[i]) i++;
            buy = prices[i];

            while (i < N && prices[i + 1] > prices[i]) i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit;

    }
}
