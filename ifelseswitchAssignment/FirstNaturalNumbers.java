package ifelseswitchAssignment;
import java.util.Scanner;
public class FirstNaturalNumbers {
	//Print the first N natural numbers starting from 1.
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Natural number lenght : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+"  ");
		}
		
		sc.close();

	}


}
