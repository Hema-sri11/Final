/**
 * 
 */
package com.in.dto;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
	private Queue<Integer> queue;
	private int maxSize;

	public Producer(Queue<Integer> queue, int maxSize) {
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		Random random = new Random();
		while (true) {

			synchronized (queue) {
				while (queue.size() == maxSize) {
					System.out.println("Queue is full, waiting...");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int num = random.nextInt(5);
				queue.add(num);
				System.out.println("Producer : " + num);
				queue.notifyAll();

			}
		}
	}
}
