package dp;

public class Fibonacci {

	long[] memo = new long[5002];

	public Fibonacci() {
		for (int i = 0; i < memo.length; i++)
			memo[i] = 0;
		memo[0] = memo[1] = 1;
	}

	public long recurFibo(int n) {
		if (n <= 1 || memo[n] != 0) {
			return memo[n];
		}
		memo[n] = recurFibo(n - 1) + recurFibo(n - 2);
		return memo[n - 1];
	}

	public static void main(String o[]) {
		Fibonacci ob = new Fibonacci();
		for (int i = 1; i <= 100; i++)
			System.out.print(ob.recurFibo(i) + " ");
	}
}
