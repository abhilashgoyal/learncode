package dp;

import java.io.IOException;

public class LongestCommonSubsequence {

	static int longestSubsequence(String input1, int i, String input2, int j) {
		if (i >= input1.length() || j >= input2.length())
			return 0;

		if (input1.charAt(i) == input2.charAt(j))
			return 1 + longestSubsequence(input1, i + 1, input2, j + 1);
		
		return max(longestSubsequence(input1, i + 1, input2, j), longestSubsequence(input1, i, input2, j + 1));
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String args[]) throws IOException {
		String X = "ABCD";
		String Y = "ABEFGC";
		System.out.println(longestSubsequence(X, 0, Y, 0));
	}
}
