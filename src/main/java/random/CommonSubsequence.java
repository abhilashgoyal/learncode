package random;

import java.util.Scanner;

public class CommonSubsequence {

	String output = "";

	public String getCommonSubSequenceStringDP(String input1, String input2, int index1, int index2) {

		int [][] matrix = new int[input1.length()][input2.length()];
		
		for(int i= 0; i < input1.length(); i++){
			
		}
		return output;
	}

	public int doesContainCommonSubSequence(String input1, String input2) {
		return getCommonSubsequence(input1, input2).length() == 0 ? 0 : 1;
	}

	public int getLenghtOfCommonSubsequence(String input1, String input2, int index1, int index2) {
		if (index1 == 0 || index2 == 0)
			return 0;
		if (input1.charAt(index1 - 1) == input2.charAt(index2 - 1)) {
			return 1 + getLenghtOfCommonSubsequence(input1, input2, index1 - 1, index2 - 1);
		} else {
			return max(getLenghtOfCommonSubsequence(input1, input2, index1 - 1, index2),
					getLenghtOfCommonSubsequence(input1, input2, index1, index2 - 1));
		}
	}

	private int max(int input1, int input2) {
		return input1 > input2 ? input1 : input2;
	}

	private StringBuffer getCommonSubsequence(String input1, String input2) {
		StringBuffer commonSequence = new StringBuffer();

		int[][] matrix = new int[input1.length()][input2.length()];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				matrix[i][j] = 0;

		int lastColumn = -1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = lastColumn + 1; j < matrix[0].length; j++) {
				if (input1.charAt(i) == input2.charAt(j)) {
					matrix[i][j] = 1;
					lastColumn = j;
					char c = input1.charAt(i);
					commonSequence.append(c);
					break;
				}
			}
		}
		System.out.println(commonSequence);
		return commonSequence;
	}

	public static void main(String o[]) {
		CommonSubsequence ob = new CommonSubsequence();
		Scanner in = new Scanner(System.in);
		int lim = in.nextInt();
		while (lim > 0) {
			String str = in.next();
			String str2 = in.next();
			if (str.length() > str2.length()) {
				System.out.println(ob.doesContainCommonSubSequence(str, str2));
				System.out.println(
						"Using Recursion:" + ob.getLenghtOfCommonSubsequence(str, str2, str.length(), str2.length()));
			} else {
				System.out.println(ob.doesContainCommonSubSequence(str2, str));
				System.out.println(
						"Using Recursion:" + ob.getLenghtOfCommonSubsequence(str2, str, str2.length(), str.length()));
			}
			lim--;
		}
		in.close();
	}
}
