package random;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public char[] reverseArr(char[] inputChar) {
		int start = 0;
		int end = inputChar.length - 1;

		while (start < end) {
			inputChar[start] ^= inputChar[end];
			inputChar[end] ^= inputChar[start];
			inputChar[start] ^= inputChar[end];

			start++;
			end--;
		}
		return inputChar;
	}

	public char[] reverseArrAscii(char[] inputChar) {
		int start = 0;
		int end = inputChar.length - 1;

		while (start < end) {
			inputChar[start] = (char) ((int) inputChar[start] + (int) inputChar[end]);
			inputChar[end] = (char) ((int) inputChar[start] - (int) inputChar[end]);
			inputChar[start] = (char) ((int) inputChar[start] - (int) inputChar[end]);

			start++;
			end--;
		}

		return inputChar;
	}

	public static void main(String o[]) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		char[] inputChar = input.toCharArray();
		ReverseArray ob = new ReverseArray();
		//System.out.println("Reversed Output: " + Arrays.toString(ob.reverseArr(inputChar)));
		System.out.println("Reversed Output using Ascii: " + Arrays.toString(ob.reverseArrAscii(inputChar)));

		in.close();
	}
}
