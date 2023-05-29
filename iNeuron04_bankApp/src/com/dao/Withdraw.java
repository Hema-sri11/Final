package com.dao;

import java.sql.SQLException;

public class Withdraw extends ActionOnAccount {

	public void withdraw() throws SQLException {

		System.out.println("\nWITHDRAW SECTION ");
		System.out.println("Enter amount for withdrawing :: ");
		money = scan.nextInt();
		data = data - money;
		System.out.println("Collect Money.....");
		withIn = withIn+money;
		viewData();
		System.out.println("\n");
		furtherWork();

	}

}
