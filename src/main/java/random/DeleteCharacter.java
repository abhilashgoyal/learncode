package random;

public class DeleteCharacter {

	public StringBuilder getModifiedString(StringBuilder output, String input, char c) {
		if (input == null)
			return output;

		if (input.charAt(0) != c) {
			output.append(input.charAt(0));
		}
		return getModifiedString(output, input.substring(1, input.length()), c);
	}

	public static void main(String... strings) {
		DeleteCharacter ob = new DeleteCharacter();
		StringBuilder input = new StringBuilder();
		System.out.println(ob.getModifiedString(input, "aabbccaadd", 'a'));

	}
}
