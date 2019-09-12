package threading;

import java.util.LinkedList;
import java.util.Scanner;

public class ProducerConsumer {

	public int bufferSize;
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	int count = 1;

	public void producer() {

		while (count < 100) {

			synchronized (this) {

				while (linkedList.size() > bufferSize) {
					try {
						System.out.println("Producer Waiting ... as The buffer is full");
						wait();
						System.out.println("Pruducer Notified ...");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int len = linkedList.size();
				System.out.println("Producer has produced an Item: " + count);
				linkedList.addFirst(count++);
				if (len == 0) {
					System.out.println("Consumer Notified As initial buffer was empty ...");
					notify();
				}
			}
		}

	}

	public void consumer() {

		while (true) {
			synchronized (this) {

				while (linkedList.size() == 0) {
					try {
						System.out.println("Consumer waiting ... As nothing to consume ...");
						wait();
						System.out.println("Consumer notifed by the producer ...");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int len = linkedList.size();
				System.out.println("Consuming data from Buffer: " + linkedList.removeLast());
				if (len == bufferSize) {
					System.out.println("Consumer notifying Producer that it has something to produce ...");
					notify();
				}
			}
		}
	}

	public static void main(String o[]) {
		Scanner in = new Scanner(System.in);
		int bufferSize = in.nextInt();
		ProducerConsumer producerConsumer = new ProducerConsumer();
		producerConsumer.bufferSize = bufferSize;
/*

		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				producerConsumer.producer();
			}
		});
		Thread consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				producerConsumer.consumer();
			}
		});

		consumer.start();
		producer.start();
		try {
			consumer.join();
			producer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/

	}
}
