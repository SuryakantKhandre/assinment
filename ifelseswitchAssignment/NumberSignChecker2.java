package ifelseswitchAssignment;

import java.util.Scanner;

public class NumberSignChecker2 {
	// Determine whether a given number is POSITIVE , NEGATIVE or ZERO.
        public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Nuumber : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("ZERO");
		}else if(num < 0) {
			System.out.println("NEGATIVE");
		}else {
			System.out.println("POSITIVE");
		}
		
		sc.close();
	}

}
