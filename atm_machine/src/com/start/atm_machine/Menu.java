package com.start.atm_machine;

import java.util.Scanner;

public class Menu {
	
//	Menu(){
//		 String displaymsg =  "Choose your goto option from the Menu";
//		 String one = "1 . CHECK BALANCE";
//		 String two = "2 . WITH DRAW";
//		 String three = "3 . DEPOSIT";
//		 String four = "4 . EXIT";
//		 
//		 System.out.println(displaymsg);
//		 System.out.println(one);
//		 System.out.println(two);
//		 System.out.println(three);
//		 System.out.println(four);
//		
//	}
	
//	 Runner r = new Runner();
	   static int balance = Runner.balance;
	 
	
	static void checkBal() {
		System.out.println(balance);
		Switch.witch();
   }
   
   static void withdraw() {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the withdraw amount");
	   int withdraw = scan.nextInt();
	   if(withdraw < balance) {
		   balance = balance - withdraw;
		   System.out.println(balance);
		   Switch.witch();
		   
	   }else {
		   System.out.println("Insufficient balance");
		   Switch.witch();
	   }
	   
   }
	
   static void Deposit() {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the Amount to Deposit");
	   int dep = scan.nextInt();
	   balance = balance + dep;
	   Switch.witch();
	   
   }
   
   static void exit() {
	   System.out.println("Press 0 to Exit");
	   System.exit(0);
	   Switch.witch();
   }
   
   public static void main(String[] args) {
	  Menu m = new Menu();
	   Menu.checkBal();
	   
	  
	
}

}
