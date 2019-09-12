package random;

import java.util.Scanner;

public class LargestRectangleArea {

	static long largestRectangle(int[] h) {
		int[] lMin = new int[h.length];
		int[] rMin = new int[h.length];
		/*
		 * loop to calculate left min for each element
		 */
		int min = h[0];
		int lMaxArea = 0;
		for (int i = 0; i < h.length; i++) {
			min = Math.min(min, h[i]);
			lMin[i] = Math.max(min * (i + 1), h[i]);
			lMaxArea = Math.max(lMin[i], lMaxArea);
		}
		/*
		 * Loop to calculate right min for each element
		 */
		min = h[h.length - 1];
		int rMaxArea = 0;
		for (int i = h.length - 1; i >= 0; i--) {
			min = Math.min(min, h[i]);
			rMin[i] = Math.max(min * (h.length - i), h[i]);
			rMaxArea = Math.max(rMin[i], rMaxArea);
		}

		return Math.max(lMaxArea, rMaxArea);
	}

	public static void main(String... o) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int[] input = new int[len];
		for (int i = 0; i < len; i++)
			input[i] = in.nextInt();
		System.out.println(largestRectangle(input));
		in.close();
	}
}
