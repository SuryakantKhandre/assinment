package ifelseswitchAssignment;
import java.util.Scanner;
public class PasswordLengthCheacker4 {
	//A login system checks whether a password is a valid base on length. 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		
		int l = password.length();
		
		if(l >= 8) {
			System.out.println("STRONG PASSWORD");
		}else {
			System.out.println("WEAK PASSWORD");
		}
		
		sc.close();
		

	}

}
