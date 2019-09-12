package random;

public class BinFind {

	boolean flag = false;

	public void findUnSortedArray(int[] a) {
		boolean isAssending = isArrayAssending(a) > 0 ? true : false;
		boolean flag = true;
		if (isAssending) {
			for (int i = 0; i < a.length - 2; i++) {
				if ((a[i + 1] - a[i]) < 0)
					System.out.println(a[i + 1]);
				flag = false;
			}
		} else {
			for (int i = 0; i < a.length - 2; i++) {
				if ((a[i + 1] - a[i]) > 0)
					System.out.println(a[i + 1]);
				flag = false;
			}
		}
		if (flag)
			System.out.println("Its perfectly OK !!");
	}

	int isArrayAssending(int a[]) {
		if (a.length < 4)
			return -1;
		int diff1 = a[0] - a[1];
		int diff2 = a[1] - a[2];
		int diff3 = a[2] - a[3];
		int countPositive = 0;

		if (diff1 > 0)
			countPositive++;
		if (diff2 > 0)
			countPositive++;
		if (diff3 > 0)
			countPositive++;

		return countPositive > 2 ? 0 : 1;

	}

	public static void main(String o[]) {
		BinFind ob = new BinFind();
		int a[] = { 1, 2, 4, 5, 6, 7, 8, 3, 9 };
		ob.findUnSortedArray(a);
		int b[] = { 9, 8, 7, 5, 4, 3, 6, 2, 1 };
		ob.findUnSortedArray(b);
	}
}
