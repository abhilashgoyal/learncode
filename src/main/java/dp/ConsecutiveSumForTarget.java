package dp;

import java.util.Scanner;

public class ConsecutiveSumForTarget {

	public void countConsecutiveSumForTarget(int[] input, int target) {
		int left = 0, right = 0, sum = 0;
		while (right < input.length) {
			sum += input[right];
			if (sum == target)
				System.out.println("From: " + left + " to: " + right);
			if (sum >= target) {
				left++;
				right = left;
				sum = 0;
			} else {
				right++;
			}
		}
	}

	public static void main(String o[]) {
		ConsecutiveSumForTarget ob = new ConsecutiveSumForTarget();
		Scanner in = new Scanner(System.in);
		int numOfCases = in.nextInt();
		while (numOfCases-- > 0) {
			int len = in.nextInt();
			int input[] = new int[len];
			for (int i = 0; i < len; i++) {
				input[i] = in.nextInt();
			}
			int target = in.nextInt();
			ob.countConsecutiveSumForTarget(input, target);
		}
		in.close();
	}
}
