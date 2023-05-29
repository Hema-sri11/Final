package com.dto;

import java.util.Scanner;

import com.dao.IShape;

public class CircleShapeImpl implements IShape {
	int length;
	Scanner scan = new Scanner(System.in);

	@Override
	public double area() {

		System.out.println("Enter the Radius of the circle :: ");
		length = scan.nextInt();
		double area = Math.pow(length, 2) * Math.PI;
		return area;
	}

	@Override
	public double paremeter() {
		System.out.println("Enter the Radius of the circle :: ");
		length = scan.nextInt();
		double peri = (2 * Math.PI * length);
		return peri;
	}

}
