package random;

import java.util.Scanner;

public class Rotate2DSquareMatrix {

	private void traverseMatrix(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				System.out.print(input[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public void initializeMatrix(int[][] input) {
		int count = 1;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				input[i][j] = count++;
			}
		}
	}

	private void transpose(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < i; j++) {
				input[i][j] = input[i][j] + input[j][i];
				input[j][i] = input[i][j] - input[j][i];
				input[i][j] = input[i][j] - input[j][i];
			}
		}
	}

	private void reverseColomns(int[][] input) {
		for (int j = 0; j < input[0].length; j++) {
			for (int i = 0; i < input.length / 2; i++) {
				int lastRow = input.length - i - 1;
				input[i][j] = input[i][j] + input[lastRow][j];
				input[lastRow][j] = input[i][j] - input[lastRow][j];
				input[i][j] = input[i][j] - input[lastRow][j];
			}
		}
	}

	public void rotateMatrix(int[][] input, int angle) {

		int maxNumberOfRotation = angle / 90;
		int currentRotation = 1;
		System.out.println("Original Matrix");
		traverseMatrix(input);
		while (currentRotation <= maxNumberOfRotation) {
			transpose(input);
			reverseColomns(input);
			System.out.println("Rotated " + currentRotation * 90 + " degree Matrix");
			traverseMatrix(input);
			currentRotation++;
		}
	}

	public static void main(String... o) {

		Rotate2DSquareMatrix ob = new Rotate2DSquareMatrix();
		Scanner in = new Scanner(System.in);

		/*
		 * Number of Test cases
		 */
		int lim = in.nextInt();
		while (lim > 0) {
			/*
			 * lenght of square matrix
			 */
			int len = in.nextInt();
			int[][] input = new int[len][len];
			ob.initializeMatrix(input);
			ob.rotateMatrix(input, 360);
			lim--;
		}

		in.close();
	}
}
