package ifelseswitchAssignment;
import java.util.Scanner;
public class CompanyLoginValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int correctPassword = 1234;
		
		int password;
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter password : ");
			password = sc.nextInt();
			if(password == correctPassword) {
				System.out.println("login successfull");
				break;
			}else if(i==2) {
				System.out.println("Account Blocked");
			}
			
		}
		
		sc.close();

	}

}
