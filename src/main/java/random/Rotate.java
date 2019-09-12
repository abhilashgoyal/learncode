package random;

public class Rotate {

	public void rotateRow(int[] input, int d) {
		int temp = d % (input.length);

		for (int i = temp; i < input.length; i++)
			System.out.print(input[i] + " ");
		for (int i = 0; i < temp; i++)
			System.out.print(input[i] + " ");
	}

	public void rotateArray(int[][] input, int k) {
		int lim = input.length;
		for (int i = 0; i < lim; i++) {
			rotateRow(input[i], k);
			System.out.println();
		}
	}

	public static void main(String o[]) {
		Rotate ob = new Rotate();
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[][] input2 = { { 1, 2, 3, 4 }, { 2, 3, 4, 1 }, { 3, 4, 1, 2 }, { 4, 1, 2, 3 } };
		ob.rotateArray(input2, 2);
		/*
		 * output: 45123
		 */
		/*
		 * for (int i = 0; i < 9; i++) { System.out.print(" Rotating " + i +
		 * " time.: "); ob.rotateRow(input, i); System.out.println(); }
		 */
	}
}
