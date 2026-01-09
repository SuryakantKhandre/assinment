package ConditionalStatement;

import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("YOUR AGE");
		int age = s.nextInt();
		
		System.out.println("MONTHLY SALARY");
		double sal = s.nextDouble();
		
		System.out.println("CREDIT SCORE");
		int sco = s.nextInt();
		
		if(age>=21) {
			if(sal>=25000) {
				if(sco>=700) {
					System.out.println("LOAN APPROVED");
					
				}
				else {
					System.out.println("LOAN REJECTED");
				}
				
				
			}else {
				System.out.println("LOAN REJECTED");
			}
			
		}else {
			System.out.println("LOAN REJECTED");
		}
		
		
		
	}


}
