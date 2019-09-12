package random;

public class AddWithoutAdd {

	private int getPositionOfLeastSignificantZero(int input) {
		int count = 0;
		while ((input & (1 << count++)) == 1)
			;
		return count;
	}

	public int addNumber(int a, int b) {
		while (b > 0) {
			int position = getPositionOfLeastSignificantZero(a);
			int tempNum = -1 << position;
			a = a & tempNum;
			a = a | 1 << position;
			b--;
		}
		return a;
	}

	public static void main(String... strings) {
		AddWithoutAdd ob = new AddWithoutAdd();
		System.out.println("Sum of 3 and 2: " + ob.addNumber(3, 2));
		System.out.println("Sum of 2 and 2: " + ob.addNumber(2, 2));
	}

}
