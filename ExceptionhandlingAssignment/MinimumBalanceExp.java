package ExceptionhandlingAssignment;

import java.util.Scanner;

public class MinimumBalanceExp {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int miniBalance = 1000;
		
		int amount = 2000;
		System.out.println("Enter withdrawl amount : ");
		int withdrawl = sc.nextInt();
		
		try {
			//condition
			if(withdrawl >= (amount - miniBalance)) {
				throw new MinimumBalanceExp1("Insufficients Balance !");
			}
			amount = amount - withdrawl; 
			System.out.println("You Withdraw Successfully : ");
			System.out.println("Your current balance is "+amount);
		}catch(MinimumBalanceExp1 e) {
			e.printStackTrace();
		}
		
		
		
	}

}

class MinimumBalanceExp1 extends RuntimeException{
	public MinimumBalanceExp1(String msg) {
		super(msg);
	}

}
