package ifelseswitchAssignment;

import java.util.Scanner;

public class OfficeEntryEligibility1 {
	//A company allows office entry only if an employee arrives before or at 9 AM. 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter arrival time : ");
		double time = sc.nextDouble();
		if(time <= 9) {
			System.out.println("ALLOWED");
		}else {
			System.out.println("LATE ENTRY");
		}
		sc.close();

	}

}
