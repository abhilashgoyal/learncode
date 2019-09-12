package random;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner User = new Scanner(System.in);
		String calc = User.nextLine();
		if ("a".equals(calc)) {
			System.out.println("A:");
		} else if ("b".equals(calc)) {
			System.out.println("B:");
		} else if ("c".equals(calc)) {
			System.out.println("C:");
		} else {
			System.out.println("Not A Letter...");
		}
	}
}