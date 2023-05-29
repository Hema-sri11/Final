package com.dao;

import com.dto.Input;

public class RunFile {

	public static void main(String[] args) {
		Input in = new Input();
		int n = in.findNum();
		if (n == -1)
			System.out.println("Value not found");

		else
			System.out.println("Key fount at index :: " + n);
	}

}
