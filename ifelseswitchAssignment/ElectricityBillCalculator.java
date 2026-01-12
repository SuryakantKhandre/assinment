package ifelseswitchAssignment;
import java.util.Scanner;
public class ElectricityBillCalculator {
	//Calculate electric bill based on units.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bill unit : ");
		int unit = sc.nextInt();
		int totalbill ;
		
		if(unit <= 100 && unit > 0) {
			totalbill = unit * 5;
			System.out.println("Total bill : "+totalbill);
		}else if(unit > 100 && unit <= 200) {
			totalbill = unit * 7;
			System.out.println("Total bill : "+totalbill);
		}else if(unit > 200){
			totalbill = unit * 10;
			System.out.println("Total bill : "+totalbill);
		}else {
			System.out.println("invalid unit");
		}
		
		sc.close();
	}

		
	
}

