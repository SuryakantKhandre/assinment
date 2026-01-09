package ConditionalStatement;

import java.util.Scanner;

public class Task1 {
	public class Task_1 {
		public static void main(String[]args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter Your Age");
			int age = s.nextInt();
			
			if(age>= 18) {
				System.out.println("ELIGIBLE");
				
			}
			else {
				System.out.println("NOT ELIGIBLE");
			}
			
			
			
		}

	}
}
