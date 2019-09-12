package dp;

public class LargestSubArray {

	class Output {
		
		int l_index;
		int r_index;
		int sum;

		public Output() {
			l_index = r_index = sum = 0;
		}
	}

	public Output returnOutput(int[] input) {
		Output output = new Output();
		for (int i = 0; i < input.length; i++) {
			if (input[i] > output.sum) {
				output.sum = input[i];
				output.r_index = i - 1;
			}
		}
		for (int i = output.r_index; i >= 0; i--) {
			if (input[i] == 0) {
				output.l_index = i;
				break;
			}
		}
		return output;
	}

	public Output subArray(int[] input) {
		int[] a = new int[input.length];

		for (int i = 0; i < a.length; i++)
			a[i] = 0;
		
		for (int i = 0, j = 1; i < input.length && j < a.length; i++, j++) {
			if ((a[j - 1] + input[i]) > 0)
				a[j] = a[j - 1] + input[i];
		}
		return returnOutput(a);
	}

	public static void main(String o[]) {
		LargestSubArray ob = new LargestSubArray();
		int[] input = {-2,-3,4,-1,-2,1,5,-3};
		Output output = ob.subArray(input);
		System.out.println("Sum: " + output.sum + " left index: " + output.l_index + " right index: " + output.r_index);
		
	}

}
