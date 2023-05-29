package com.deo;

import java.util.Scanner;

import com.dto.CircleShapeImpl;
import com.dto.RectangleShapeImpl;
import com.dto.TriangleShapeImpl;

public class ShapeCall {

	static Scanner scan = new Scanner(System.in);
	static int decision;

	public static void main(String[] args) {

		System.out.println("What  Shape you Choose To find Area And Perimeter ");
		System.out.println("1 for Circle \n2 for Rectangle \n3 for Triangle");
		decision = scan.nextInt();

		switch (decision) {
		case 1: {
			CircleShapeImpl cshi = new CircleShapeImpl();
			double are = cshi.area();
			double per = cshi.paremeter();
			System.out.println("Area Of the Circle is :: " + are);
			System.out.println("Area Of the Circle is :: " + per);
		}
		case 2: {
			RectangleShapeImpl rshi = new RectangleShapeImpl();
			System.out.println("Area of the Rectangle :: " + rshi.area());
			System.out.println("Perimeter of rectangle :: " + rshi.paremeter());
		}
		case 3: {
			TriangleShapeImpl tshi = new TriangleShapeImpl();
			System.out.println("Area of a triangle :: " + tshi.area());
			System.out.println("Area of a triangle :: " + tshi.paremeter());
		}
		default :{
			System.out.println("Please choose valid Option for continue ");
		}
		}
	}

}
