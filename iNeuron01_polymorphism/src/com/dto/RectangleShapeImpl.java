package com.dto;

import java.util.Scanner;

import com.dao.IShape;

public class RectangleShapeImpl implements IShape {
	int length;
	int width;
	Scanner scan = new Scanner(System.in);

	@Override
	public double area() {
		System.out.println("enter the Length and width of the rectangle :: ");
		length = scan.nextInt();
		width= scan.nextInt();
		
		return length*width;
	}

	@Override
	public double paremeter() {
		System.out.println("enter the Length and width of the rectangle :: ");
		length = scan.nextInt();
		width= scan.nextInt();
		return 2*(length+width);
	}

}
