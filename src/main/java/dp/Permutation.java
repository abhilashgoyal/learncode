package dp;

public class Permutation {

	private static void permutationOfString(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutationOfString(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	public static void main(String[] args){
		permutationOfString("", "abc");
		System.out.println("#########################################");
		permutationOfString("", "wxyz");
	}
}
