package ifelseswitchAssignment;

import java.util.Scanner;

public class DayTypeIdentifier3 {
	//A company system identifies whether a day is a Working day or Weekend.
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the day : ");
	int day = sc.nextInt();
	
	switch(day) {
	case 1 : 
		System.out.println("Monday Working Day");
		break;
	case 2 :
		System.out.println("Tuesday Working Day");
		break;
	case 3 :
		System.out.println("Wensday Working Day");
		break;
	case 4 :
		System.out.println("Thursday Working Day");
		break;
	case 5 :
		System.out.println("Friday Working Day");
		break;
	case 6 :
		System.out.println("Saturday Weekend");
		break;
	case 7 :
		System.out.println("Sunday Weekend");
		break;
	default :
		System.out.println("Invalid day");
	}
	
	sc.close();
}

}


