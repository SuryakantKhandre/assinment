package ExceptionhandlingAssignment;

import java.util.Scanner;

public class LoginAttemptExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 1234;
		
		try {
			for(int i=0;i<3;i++) {
				System.out.println("Enter password : ");
				int inputpassword = sc.nextInt();
				if(inputpassword == password) {
					System.out.println("You login succssfully !");
					break;
				}else if(inputpassword != password && i==2) {
					throw new LoginAttemptExp1("Account is blocked");
				}
			}
			
			
		}catch(LoginAttemptExp1 e) {
			e.printStackTrace();
		}
	}

}

class LoginAttemptExp1  extends RuntimeException{
	public LoginAttemptExp1 (String msg) {
		super(msg);
	}
}



