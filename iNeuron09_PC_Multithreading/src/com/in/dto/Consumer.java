/**
 * 
 */
package com.in.dto;

import java.util.Queue;

/**
 * @author rishi
 *
 */
public class Consumer implements Runnable {
	private Queue<Integer> queue;

	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {

					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int sum = 0;
				while (!queue.isEmpty()) {
					sum += queue.poll();
				}
				System.out.println("Consumer : " + sum);
				queue.notifyAll();
			}
		}

	}
}
