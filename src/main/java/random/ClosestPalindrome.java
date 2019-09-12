package random;

class ClosestPalindrome {
	int num;
	int fwp;
	int bwp;
	int nearp;
	boolean flag;

	public boolean checkPalindrome(int input) {
		int rev = 0;
		this.num = input;
		while (input > 0) {
			rev = (rev * 10) + (input % 10);
			input = input / 10;
		}
		if (rev == this.num) {
			flag = true;
		} else
			flag = false;
		return flag;
	}

	public void nearPalindrome(int input) {
		int tempNum = input;
		input = tempNum - 1;
		while (!checkPalindrome(input)) {
			input = input - 1;
		}
		bwp = input;
		input = tempNum + 1;
		while (!checkPalindrome(input)) {
			input = input + 1;
		}
		fwp = input;
		input = tempNum;
		if ((input - bwp) < (fwp - input))
			System.out.println("Nearest Palindrome is " + bwp);
		else if ((input - bwp) > (fwp - input))
			System.out.println("Nearest Palindrome is " + fwp);
		else if ((input - bwp) == (fwp - input))
			System.out.println("Two Nearest palindrome no are " + bwp + " and " + fwp);
	}

	public static void main(String[] args) {
		ClosestPalindrome p = new ClosestPalindrome();
		p.nearPalindrome(500);
		p.nearPalindrome(100);
	}
}
