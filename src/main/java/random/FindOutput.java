package random;

public class FindOutput {

	public static void main(String[] args) {
		int[] input = { 3, 8, 5, 5, 2, 5, 1, 4, 7 };
		for (int i = 0; i < input.length; i++) {
			System.out.print((char) (input[i] + 64));
		}
	}
}
