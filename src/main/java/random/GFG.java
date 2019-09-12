package random;

import java.util.LinkedList;
import java.util.Scanner;

public class GFG {

	int location = -1;
	static LinkedList<Integer> linkedlist = new LinkedList<Integer>();

	private void getLocation(int[] input, int x) {

		int r = input.length - 1;
		int l = 0;
		boolean flag = true;
		int pivot = -1;
		while (l <= r) {
			pivot = (l + r) / 2;
			if (input[pivot] == x) {
				flag = false;
				break;
			} else if (x < input[pivot])
				r = pivot - 1;
			else
				l = pivot + 1;
		}

		if (flag) {
			linkedlist.push(-1);
		} else {
			int lIndex = pivot;
			int rIndex = pivot;
			while (input[rIndex] == x) {
				rIndex++;
			}
			while (input[lIndex] == x) {
				lIndex--;
			}
			linkedlist.push(++lIndex);
			linkedlist.push(--rIndex);
		}
	}

	private void printOut() {

		while (!linkedlist.isEmpty()) {
			int out = linkedlist.removeLast();
			if (out == -1)
				System.out.println(out);
			else {
				System.out.println(out + " " + linkedlist.removeLast());
			}

		}

	}

	public static void main(String o[]) {
		GFG ob = new GFG();
		Scanner in = new Scanner(System.in);
		int lim = in.nextInt();
		int output[][] = new int[lim][2];
		while (lim-- > 0) {
			int arrLen = in.nextInt();
			int findX = in.nextInt();
			int[] arr = new int[arrLen];
			for (int i = 0; i < arrLen; i++)
				arr[i] = in.nextInt();

			ob.getLocation(arr, findX);
		}
		in.close();
		ob.printOut();
	}
}
