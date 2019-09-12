package random;

public class InPlaceFrequency {

	public void setFrequency(int[] input) {

		for (int i = 0; i < input.length; i++) {
			if (input[i] == i)
				input[i] = 1;

		}

	}
}
