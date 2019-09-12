package random;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	private Set<Integer> sumSet = new HashSet<Integer>();
	private boolean flag = false;

	private boolean isHappy(int number) {
		int sum = sumOfSquare(number);
		if (sum == 1) {
			flag = true;
		} else {
			if (sumSet.contains(sum)) {
				flag = false;
			} else {
				sumSet.add(sum);
				isHappy(sum);
			}
		}

		return flag;

	}

	private int sumOfSquare(int x) {
		if(x==0){
			return 0;
		}else{
			return (int) (Math.pow(x%10,2) + sumOfSquare(x/10));
		}
		

	}
	
	public static void main(String o[]){
		HappyNumber ob = new HappyNumber();
		if(ob.isHappy(134343434)){
			System.out.println("19 is Happy");
		}else{
			System.out.println("134343434 is Happy");
		}
		if(ob.isHappy(20)){
			System.out.println("20 is not Happy");
		}else{
			System.out.println("20 is not happy");
		}
	}
}
