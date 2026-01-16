package TwoDimentionalArray;

import java.util.Scanner;
// Find the largest element in each row of a matrix.
public class LargestElementInEachRow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Read number of rows and columns
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		// Read elements
		for(int r=0; r<rows; r++) {
			for(int c=0; c<cols; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		for(int r=0; r<rows;  r++) {
			int max = arr[r][0];
			for(int c=1; c<cols; c++) {
				if(arr[r][c] > max) {
					max = arr[r][c];
				}
			}
			
			System.out.println("Largest Element in row"+ (r = 1) + " = " + max);
		}
		sc.close();
	}

}
