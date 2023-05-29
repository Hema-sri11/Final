package com.dao;

import java.sql.SQLException;

public class Transfer extends ActionOnAccount {
	String accountName = null;

	public void transfer() throws SQLException {
		System.out.println("TRANSFER SECTION \nEnter Money for Transfering");
		money = scan.nextInt();
		System.out.println("Enter Receiver Account Number");
		accountName = scan.next();
		data = data - money;
		System.out.println("Data tranfer successfully in " + accountName + " account");
		transIn = transIn + money;
		viewData();
		System.out.println("\n");
		furtherWork();

	}
}
