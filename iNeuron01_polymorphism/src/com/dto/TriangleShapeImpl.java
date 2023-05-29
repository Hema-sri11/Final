package com.dto;

import java.util.Scanner;

import com.dao.IShape;

public class TriangleShapeImpl implements IShape {
	int base;
	int height;
	int length;
	Scanner scan = new Scanner(System.in);

	@Override
	public double area() {
		System.out.println("Enter the base and height of a triangle :: ");
		base= scan.nextInt();
		height=scan.nextInt();
		
		return 1%2*(base*height);
	}

	@Override
	public double paremeter() {
		System.out.println("Enter the three sides of a triangle :: ");
		base= scan.nextInt();
		height=scan.nextInt();
		length= scan.nextInt();
		return (base+height+length);
	}

}
