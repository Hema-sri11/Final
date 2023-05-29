package com.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.dto.ShowView;

public class ActionOnAccount {
	static int depoIn = 0;
	static int transIn = 0;
	static int withIn = 0;

	public static int data = 5000;
	public Scanner scan = new Scanner(System.in);
	public int money = 0;
	public String decide = null;

	void furtherWork() throws SQLException {
		System.out.println("YOu have other work to do :: yes/no");
		decide = scan.next();
		if (decide.equalsIgnoreCase("yes")) {
			ShowView svv = new ShowView();
			svv.display();
		} else {
			System.out.println("Account get log off ");
		}
	}

	void viewData() {
		System.out.println("Are you want to see data:: [yes/no]");
		decide = scan.next();
		if (decide.equalsIgnoreCase("yes")) {

			System.out.println(data);
		}
	}
}






