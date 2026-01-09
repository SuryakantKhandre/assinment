package ConditionalStatement;

import java.util.Scanner;

public class Task5 {
public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER THE SALARY");
		int sal=s.nextInt();
		
		System.out.println("ENTER EXPERIENCE");
		int exp=s.nextInt();
		
		if(sal>=30000 && exp >= 3) {
			System.out.println("BONUS ELIGIBLE");
			
		}
		else {
			System.out.println("NOT ELIGIBLE");
		}
	}


}
