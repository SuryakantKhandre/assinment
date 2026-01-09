package ConditionalStatement;

import java.util.Scanner;

public class Task2 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Amount");
		double balance = s.nextDouble();
		
		if(balance>= 1000) {
			System.out.println("BALANCE OK");
			
		}
		else {
			System.out.println("LOW BALANCE");
		}
		
		
		
	}

}
