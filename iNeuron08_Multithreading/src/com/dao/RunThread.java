package com.dao;


import com.dto.EvenThread;
import com.dto.OddThread;

public class RunThread {

	public static void main(String[] args) {
		OddThread ot = new OddThread();
		EvenThread et = new EvenThread();
		
		et.start();
		ot.start();

	}

}
