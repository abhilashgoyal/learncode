package random;

import java.util.Arrays;

public class SherlockProblem {

	static int cost(int[] arr) {
		// Complete this function
		int[] temp1 = new int[arr.length];
		int[] temp2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				temp1[i] = 1;
				temp2[i] = arr[i];
			} else {
				temp1[i] = arr[i];
				temp2[i] = 1;
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		
		System.out.println(Arrays.toString(temp1).replace("[", "").replace("]", "").replace(",", ""));
		System.out.println(Arrays.toString(temp2).replace("[", "").replace("]", "").replace(",", ""));

		for (int i = 1; i < temp1.length; i++) {
			sum1 += Math.abs(temp1[i - 1] - temp1[i]);
			sum2 += Math.abs(temp2[i - 1] - temp2[i]);
		}
		return sum1 > sum2 ? sum1 : sum2;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 10};
		int result = cost(arr);
		System.out.println(result);
	}
}
