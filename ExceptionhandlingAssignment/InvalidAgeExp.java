package ExceptionhandlingAssignment;

import java.util.Scanner;

public class InvalidAgeExp {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			try {
				
				if(age < 21 || age > 35) {
					throw new InvalidAgeExp1("Invalid Age !");
				}
				
				System.out.println("Valid age");
				
			}catch(InvalidAgeExp1 e ) {
				e.printStackTrace();
			}

		}

	}

	class InvalidAgeExp1 extends RuntimeException{
		public InvalidAgeExp1(String msg) {
			super(msg);
		}
}


