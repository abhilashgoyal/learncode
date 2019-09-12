package random;

public class ReverseNumber {

	int revNum = 0;

	private int reverNumber(int num) {

		if (num == 0)
			return num;
		else {
			revNum = revNum * 10 + num % 10;
			reverNumber(num / 10);
		}
		return revNum;
	}

	public static void main(String o[]) {
		ReverseNumber reverseNumber = new ReverseNumber();
		System.out.println(reverseNumber.reverNumber(0001000));
	}
}
