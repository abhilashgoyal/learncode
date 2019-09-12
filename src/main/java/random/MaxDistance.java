package random;

import java.io.IOException;
import java.util.ArrayList;

public class MaxDistance {

	ArrayList<String> stackArray = new ArrayList<String>();

	private String pop() {
		if (stackArray.size() == 0)
			return "";

		return stackArray.remove(stackArray.size() - 1);
	}

	private void popAll() {
		stackArray.clear();
	}

	private void push(String input) {
		stackArray.add(input);
	}

	private int calMinDistance(String[] inputArray, String type) {
		int minDistance = inputArray.length;
		String lastPush = null;
		for (int i = 0; i < inputArray.length; i++) {
			if (minDistance == 1)
				break;
			if (!(inputArray[i].equals("dog") || inputArray[i].equals("bull"))) {
				push(inputArray[i]);
			} else if ((inputArray[i].equals("dog") || inputArray[i].equals("bull")) && lastPush == null) {
				push(inputArray[i]);
				lastPush = inputArray[i];
			} else if ((inputArray[i].equals("dog")) && (lastPush != null && lastPush.equals("bull"))
					|| (inputArray[i].equals("bull")) && (lastPush != null && lastPush.equals("dog"))) {
				int count = 0;
				do {
					count++;
				} while (!pop().equals(lastPush));
				push(inputArray[i]);
				lastPush = inputArray[i];
				minDistance = minDistance < count ? minDistance : count;
			} else if ((inputArray[i].equals("dog")) && (lastPush != null && lastPush.equals("dog"))
					|| (inputArray[i].equals("bull")) && (lastPush != null && lastPush.equals("bull"))) {
				popAll();
				push(inputArray[i]);
				lastPush = inputArray[i];
			} else {
				System.out.println("Unhandled case ...");
			}
		}

		return minDistance;
	}

	private int calMinDistance(String[] inputArray) {
		int minDistance = inputArray.length;
		int len = inputArray.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if ((inputArray[i].equals("dog") && inputArray[j].equals("bull") && (j - i) < minDistance)
						|| (inputArray[len - i - 1].equals("dog") && inputArray[len - j - 1].equals("bull")
								&& Math.abs(j - i) < minDistance)) {
					minDistance = j - i;
				}

			}
		}

		return minDistance;
	}

	public static void main(String o[]) throws IOException {
		MaxDistance maxDistance = new MaxDistance();
		String[] demoInput = { "dog", "cat", "kutchbhi", "bull", "dog", "bull" };
		System.out
				.println("Minimum distance between dog and bull is: " + maxDistance.calMinDistance(demoInput, "stack"));
	}
}
