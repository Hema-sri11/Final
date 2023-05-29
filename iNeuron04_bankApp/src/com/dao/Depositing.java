package com.dao;

import java.sql.SQLException;

public class Depositing extends ActionOnAccount {

	public void deposit() throws SQLException {
		System.out.println("MONEY DEPOSITE SECTION");
	//	DbConnector dbb = new DbConnector();

		System.out.println("Enter Amount to deposite ");
		money = scan.nextInt();
		data = data + money;
		System.out.println("Your Money Succesfully Deposite ");
		depoIn = depoIn + money;
		viewData();
		System.out.println("\n");
		furtherWork();
	}
}
