package ConditionalStatement;

import java.util.Scanner;

public class Task3 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = s.nextInt();
		
		if(num> 0) {
			System.out.println("POSITIVE");
			
		}
		else if(num<0){
			System.out.println("NEGATIVE");
		}
		else {
			System.out.println("ZERO");
		}
		
		
		
	}

}
