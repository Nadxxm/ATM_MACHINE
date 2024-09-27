package com.start.atm_machine;

import java.util.Scanner;

public class Runner {

	static int balance = 0;
	static int pin = 9986;
	
   static void Atm() {
		Scanner scan = new Scanner(System.in);
		Menu m = new Menu();
		System.out.println("Welcome to ATM Machine");
		System.out.println("Enter your Pin");
		int p = scan.nextInt();
		if(pin == p) {
			Switch s = new Switch();
			s.witch();
		}else {
		  System.out.println("You Have Entered Wrong pin");			
		}
   }

}
