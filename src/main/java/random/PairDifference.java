package random;

import java.util.HashMap;

class PairDifference {

	static boolean findPairHash(int arr[], int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(Math.abs(arr[i]))) {
				System.out.println("(" + map.get(arr[i]) + "," + arr[i] + ")");
				return true;
			} else
				map.put(n + arr[i], arr[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 20, 3, 2, 50, 80};
		int n = 78;
		findPairHash(arr, n);
	}
}
