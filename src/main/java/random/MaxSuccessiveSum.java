package random;

import java.io.IOException;

public class MaxSuccessiveSum {

	static int maxSucessiveDistance(int[] input){
		int[] maxSum = new int[input.length + 1];
		
		for(int i = 0;i< maxSum.length;i++)
			maxSum[i] = 0;

		for(int i = 1; i<= input.length; i++){
			if(maxSum[i-1] + input[i-1] >= 0)
				maxSum[i] = maxSum[i-1] + input[i-1];
		}
		
		int max = maxSum[0];
		for(int i = 0; i< maxSum.length; i++){
			if(max <= maxSum[i])
				max =  maxSum[i];
		}
		
		return max;
	}

	public static void main(String o[]) throws IOException {
		int[] demoInput = { -2, -3, 4, -5, -5, -6, -20, -5, -7 };
		int[] demoInput1 = { -2, -3, -4, -5, 5, 6, -20, 5, 7 };
		System.out.println(maxSucessiveDistance(demoInput));
		System.out.println(maxSucessiveDistance(demoInput1));
	}
}
