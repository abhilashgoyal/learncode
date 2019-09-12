package threading;

public class OddEvenDemo {
	boolean isOddTurn;
	int counter = 1;
	int maxCount = 20;

	public synchronized void printEven() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		while (counter < maxCount) {
			System.out.println("Checking even thread ...");
			while (isOddTurn) {
				try {
					System.out.println("Even function waiting ...");
					wait();
					System.out.println("Even function notified ...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Even function count: " + counter);
			counter++;
			isOddTurn = true;
			notify();
		}
	}

	public synchronized void printOdd() {
		while (counter < maxCount) {
			System.out.println("Checking Odd thread ...");
			while (!isOddTurn) {
				try {
					System.out.println("Odd function waiting ...");
					wait();
					System.out.println("Odd function notified ...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Odd function count: " + counter);
			counter++;
			isOddTurn = false;
			notify();
		}
	}

	public static void main(String o[]) {
		/*OddEvenDemo ob = new OddEvenDemo();
		ob.isOddTurn = true;
		Thread evenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				ob.printEven();
			}
		});

		Thread oddThread = new Thread(new Runnable() {
			@Override
			public void run() {
				ob.printOdd();
			}
		});

		evenThread.start();
		oddThread.start();
*/
		/*
		 * try { evenThread.join(); oddThread.join(); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 */

	}
}