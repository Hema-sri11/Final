package com.in.dao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import com.in.dto.Consumer;
import com.in.dto.Producer;

public class ProducerConsumerThread {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		int maxSize = 10;

		Producer producer = new Producer(queue, maxSize);
		
		Consumer consumer = new Consumer(queue);
       
		Thread producerthread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerthread.start();
		consumerThread.start();

	}

}
