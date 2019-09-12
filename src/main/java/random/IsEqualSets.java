package random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsEqualSets {

	public int isEqual(int[] a, int[] b) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		if (a.length != b.length)
			return 0;

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], 1);
		}
		for (int i = 0; i < b.length; i++) {
			if (map.get(b[i]) == null)
				return 0;
		}
		return 1;
	}

	public static void main(String o[]) {
		IsEqualSets ob = new IsEqualSets();
		
		Scanner in = new Scanner(System.in);
		int loopSize = in.nextInt();
		
		for(int i = 0; i< loopSize; i++){
			int len = in.nextInt();
			int [] a = new int[len];
			int [] b = new int[len];
			for(int j = 0; j< len; j++){
				a[j] = in.nextInt();
			}
			for(int j = 0; j< len; j++){
				b[j] = in.nextInt();
			}
			
			System.out.println(ob.isEqual(a, b));
		}
		in.close();
	}
}
