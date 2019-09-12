package random;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingChar {

	public char getFirstRepeatingChar(String input) {
		char result = ' ';
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (int i = 0; i < input.length(); i++) {
			if (map.get(input.charAt(i)) > 1) {
				result = input.charAt(i);
				break;
			}
		}

		return result;
	}

	public static void main(String o[]) {
		FirstRepeatingChar ob = new FirstRepeatingChar();
		char result = ob.getFirstRepeatingChar("fd");
		System.out.println("First repeating character is: " + (result == ' ' ? -1 : result));
	}

}