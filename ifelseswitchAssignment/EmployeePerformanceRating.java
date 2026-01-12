package ifelseswitchAssignment;
import java.util.Scanner;
public class EmployeePerformanceRating {
	//An employees rating depends on performance score.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the score range : ");
		int score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("Score is out of range .");
		}else if(score >= 75) {
			System.out.println("EXCELLENT");
		}else if(score < 75 && score >= 50) {
			System.out.println("GOOD");
		}else {
			System.out.println("NEED IMPROVEMENT");
		}
		
		sc.close();
	}

}
