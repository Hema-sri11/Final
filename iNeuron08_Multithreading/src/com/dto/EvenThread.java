package com.dto;

public class EvenThread extends Thread {
	@Override
	public void run() {
		System.out.println("Even Number Thread");
		for (int i = 0; i < 21; i++) {
			if (i % 2 == 0)
				System.out.println(i);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
