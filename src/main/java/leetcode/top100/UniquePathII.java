package leetcode.top100;

/**
 * https://leetcode.com/problems/unique-paths-ii/
 */
public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid == null || obstacleGrid.length == 0) return 0;

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                // for any obstacle we cannot reach there, hence number of ways = 0
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                    // for first element
                else if (i == 0 && j == 0) dp[i][j] = 1;
                    // for first row
                else if (i == 0) dp[i][j] = dp[i][j - 1];
                    // for first column
                else if (j == 0) dp[i][j] = dp[i - 1][j];
                    // else a person can come only from a row above or a column to the right
                else if (obstacleGrid[i][j] == 0) dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] o) {
        UniquePathII uniquePathII = new UniquePathII();
    }
}

