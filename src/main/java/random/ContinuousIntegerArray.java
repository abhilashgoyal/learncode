package random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ContinuousIntegerArray {

	public boolean doesContainContiguousInteger(int[] input) {

		Set<Integer> a = new HashSet<Integer>();
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			a.add(input[i]);
		}
		Iterator<Integer> iterator = a.iterator();
		int pre = iterator.next();
		int diff = 0;

		while (iterator.hasNext()) {
			int nxt = iterator.next();
			diff = nxt - pre;
			if (diff != 1) {
				return false;
			}
			pre = nxt;
		}

		return true;
	}

	public static void main(String o[]) {
		ContinuousIntegerArray ob = new ContinuousIntegerArray();
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		for (int i = 0; i < limit; i++) {
			int[] input = new int[in.nextInt()];
			for (int j = 0; j < input.length; j++)
				input[j] = in.nextInt();
			System.out.println(ob.doesContainContiguousInteger(input));
		}
	}
}
