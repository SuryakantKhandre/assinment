package ifelseswitchAssignment;
import java.util.Scanner;
public class AtmWithdrawalSimulation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account balance : ");
		int b = sc.nextInt();
		System.out.println("Enter withdrawal amount : ");
		int w = sc.nextInt();
		int Abalance = Accountbalance(b);
		int withdrawalamount = withdrawalAmount(w);
		
		if(Abalance > withdrawalamount) {
			System.out.println("Wuthdrawal Successful");
			System.out.println("Balance = "+(Abalance = Abalance - withdrawalamount));
		}else if(withdrawalamount > Abalance) {
			System.out.println("Insufficient Balance");
		}
		
		sc.close();
		
	}
	
	static public int Accountbalance(int balance) {
		if(balance < 0) {
			return 0;
		}else {
			return balance;
		}
	}
	
	static public int withdrawalAmount(int withdrawalAmount) {
		if(withdrawalAmount % 100 == 0) {
			return withdrawalAmount;
		}else {
			System.out.println("Invalid Amount");
			return 0;
		}
	}

}
