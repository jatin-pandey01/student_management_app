package com.aurionpro.test;

import com.aurionpro.controller.AdminController;

public class Test {

	public static void main(String[] args) {
		AdminController adminController = AdminController.getObject();
		Driver driver = new Driver();
		
		while(!adminController.login()) {
			System.out.println("\nPlease try again :) ");
		}
		
		driver.main();
		
	}

}
