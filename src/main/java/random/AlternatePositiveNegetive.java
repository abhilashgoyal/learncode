package random;

import java.util.Scanner;

public class AlternatePositiveNegetive {

	public void getOutput(int[] input) {
		int posIndex = 0;
		int negIndex = 0;
		do {
			while (input[posIndex] < 0 && posIndex < input.length)
				posIndex++;
			while (input[negIndex] > 0 && negIndex < input.length)
				negIndex++;
			System.out.print(input[posIndex] + " ");
			System.out.print(input[negIndex] + " ");
			posIndex++;
			negIndex++;
		} while (posIndex < input.length && negIndex < input.length);
		System.out.println();
	}

	public static void main(String o[]) {
		AlternatePositiveNegetive ob = new AlternatePositiveNegetive();
		Scanner in = new Scanner(System.in);
		int lim = in.nextInt();
		while (lim-- > 0) {
			int size = in.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < size; i++)
				arr[i] = in.nextInt();
			ob.getOutput(arr);
		}

	}
}
