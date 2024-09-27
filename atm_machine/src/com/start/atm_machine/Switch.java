package com.start.atm_machine;

import java.util.Scanner;

public class Switch {
	
	static void witch() {
		
		 String displaymsg =  "Choose your goto option from the Menu";
		 String one = "1 . CHECK BALANCE";
		 String two = "2 . WITH DRAW";
		 String three = "3 . DEPOSIT";
		 String four = "4 . EXIT";
		 
		 System.out.println(displaymsg);
		 System.out.println(one);
		 System.out.println(two);
		 System.out.println(three);
		 System.out.println(four);
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		Menu m = new Menu();
		
		switch (choice) {
	    case 1:
	    	m.checkBal();
	        break;
	    case 2:
	    	m.withdraw();
	        break;
	    case 3:
	    	m.Deposit();
	    	break;
	    case 4:
	    	m.exit();
	    	break;
	    default:
	        // default code block
	    	System.out.println("Please Enter the Valid Number");
	}
		
	
	}
	
}
