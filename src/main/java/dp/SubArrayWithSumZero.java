package dp;

public class SubArrayWithSumZero {

	public void printSubArray(int arr[]) {
		int subArr[] = new int[arr.length + 1];
		for (int i = 0; i < subArr.length; i++)
			subArr[i] = 0;
		int lIndex = 0;

		for (int i = 0, j = 1; i < arr.length && j < subArr.length; i++, j++) {
			subArr[j] = subArr[j - 1] + arr[i];
			if (subArr[j] == 0) {
				System.out.println("SubArray with sum Zero found at location between: " + lIndex + " : " + i);
				lIndex = i + 1;
			}
		}
	}

	public static void main(String o[]) {
		SubArrayWithSumZero ob = new SubArrayWithSumZero();
		int[] input = { 1, 2, 3, -6, 3, 2, -5 };
		ob.printSubArray(input);
	}
}
