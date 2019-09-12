package random;

public class MultipleInZeroOne {

	public void test(Integer number) {
		long num = (int) Math.pow(10, number.toString().length() - 1);
		boolean flag = true;
		while (flag) {
			if (num % number == 0)
				flag = false;
			else
				num = getNextLongNum(num);
		}
		System.out.println("For input: " + number + " Output is: " + num);
	}

	public long getNextLongNum(long previousNumber) {
		return Long
				.parseLong(String.valueOf(Long.toBinaryString(Long.parseLong(String.valueOf(previousNumber), 2) + 1)));
	}

	public static void main(String o[]) {
		MultipleInZeroOne ob = new MultipleInZeroOne();
		ob.test(499);
		for (int i = 1; i <= 3; i++) {
			ob.test(i);
		}
	}
}
