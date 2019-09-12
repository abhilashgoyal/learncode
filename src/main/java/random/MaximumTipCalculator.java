package random;

import java.util.Scanner;

public class MaximumTipCalculator {

	int sum = 0;

	public int maxTip(int input1[], int[] input2, int x, int y) {

		int maxInput1 = -1;
		int maxInput2 = -1;
		int tempInput1 = -1;
		int tempInput2 = -1;
		boolean flag1 = false;
		boolean flag2 = false;
		for (int j = 0; j < input1.length; j++) {
			for (int i = 0; i < input1.length; i++) {
				if ((input1[i] > maxInput1) && !flag1) {
					tempInput1 = i;
					maxInput1 = input1[i];
				}
				if ((input2[i] > maxInput2) && !flag2) {
					tempInput2 = i;
					maxInput2 = input2[i];
				}
			}
			if ((maxInput1 >= maxInput2)) {
				sum += maxInput1;
				input1[tempInput1] = input2[tempInput1] = -1;
				x--;
				if (x == 0)
					flag1 = true;
			}
			if ((maxInput2 > maxInput1)) {
				sum += maxInput2;
				input1[tempInput2] = input2[tempInput2] = -1;
				y--;
				if (y == 0)
					flag2 = true;
			}

			maxInput1 = maxInput2 = -1;
		}

		return sum;
	}

	public static void main(String o[]) {
		MaximumTipCalculator ob = new MaximumTipCalculator();
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		for (int i = 0; i < numTest ; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int n = in.nextInt();
			int input1[] = new int[x];
			int input2[] = new int[x];
			for (int j = 0; j < x; j++)
				input1[j] = in.nextInt();
			for (int j = 0; j < x; j++)
				input2[j] = in.nextInt();
			
			System.out.println(ob.maxTip(input1, input2, y, n));
		}
		in.close();
	}
}
