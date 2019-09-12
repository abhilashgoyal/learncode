package dp;

public class Practice1 {

	public void numberOfDiffWays(int n) {
		int[] DP = new int[n + 1];
		DP[0] = 1;
		DP[1] = 1;
		DP[2] = 1;
		DP[3] = 2;

		for (int i = 4; i <= n; i++)
			DP[i] = DP[i - 1] + DP[i - 3] + DP[i - 4];

		for (int x : DP)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String o[]) {
		Practice1 ob = new Practice1();
		ob.numberOfDiffWays(6);
		ob.numberOfDiffWays(5);
	}
}
