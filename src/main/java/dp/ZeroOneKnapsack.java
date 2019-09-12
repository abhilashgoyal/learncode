package dp;

import java.util.Arrays;
import java.util.Comparator;

public class ZeroOneKnapsack {

	public int rentResult(int[] weight, int[] value, int knapsackSize) {

		double[][] matrix = new double[weight.length][3];

		for (int i = 0; i < matrix.length; i++) {
			matrix[i][0] = weight[i];
			matrix[i][1] = value[i];

			matrix[i][2] = value[i] / (double)weight[i];
		}

		Arrays.sort(matrix, new Comparator<double[]>() {
			public int compare(double[] a, double[] b) {
				return Double.compare(a[2], b[2]);
			}
		});

		int maxCost = 0;
		for (int i = matrix.length - 1; i >= 0; i--) {

			int toKeep = (int) matrix[i][0];
			if (toKeep < knapsackSize) {
				maxCost += matrix[i][1];
				knapsackSize -= toKeep;
			} else {
				maxCost += knapsackSize * matrix[i][2];
				knapsackSize -= knapsackSize;
			}
		}

		return maxCost;

	}

	public static void main(String o[]) {
		ZeroOneKnapsack ob = new ZeroOneKnapsack();
		int value[] = { 60, 100, 120 };
		int weight[] = { 15, 10, 30 };
		System.out.println("Maximum cost is: " + ob.rentResult(weight, value, 50));

	}
}
