package random;

public class RainWaterHarvesting {

	int savedWater = 0;

	public int amountOfWaterSaved(int[] elavationMap) {

		int rightMax[] = new int[elavationMap.length];
		int leftMax[] = new int[elavationMap.length];

		int left = -1;
		int right = -1;
		for (int i = 0, j = elavationMap.length - 1; i < (elavationMap.length - 1) && j >= 0; i++, j--) {
			if (right < elavationMap[i])
				right = elavationMap[i];
			if (left < elavationMap[j])
				left = elavationMap[j];
			leftMax[i] = left;
			rightMax[i] = right;
		}

		for (int i = 0; i < elavationMap.length - 1; i++) {
			savedWater += (min(rightMax[i], leftMax[i]) - elavationMap[i]);
		}

		return savedWater;
	}

	public int min(int a, int b) {
		return a < b ? a : b;
	}

	public static void main(String o[]) {
		RainWaterHarvesting ob = new RainWaterHarvesting();
		int arr[] = { 3, 0, 0, 2, 0, 4 };
		System.out.println(ob.amountOfWaterSaved(arr));
	}
}
