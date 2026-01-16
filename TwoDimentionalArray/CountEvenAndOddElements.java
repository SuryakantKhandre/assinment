package TwoDimentionalArray;

import java.util.Scanner;

//Count the number of even and odd number present in 2D array. 
public class CountEvenAndOddElements {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter columns: ");
	        int cols = sc.nextInt();

	        int arr[][] = {{rows},{cols}};

	        // Input
	        System.out.println("Enter elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }

	        int evenCount = 0, oddCount = 0;

	        // Check uniqueness 
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {

	                boolean isDuplicate = false;

	                // Check previous elements
	                for (int x = 0; x <= i; x++) {
	                    for (int y = 0; y < cols; y++) {

	                        if (x == i && y == j)
	                            break;

	                        if (arr[i][j] == arr[x][y]) {
	                            isDuplicate = true;
	                            break;
	                        }
	                    }
	                    if (isDuplicate)
	                        break;
	                }

	                // Count only unique elements
	                if (!isDuplicate) {
	                    if (arr[i][j] % 2 == 0)
	                        evenCount++;
	                    else
	                        oddCount++;
	                }
	            }
	        }

	        System.out.println("Even count: " + evenCount);
	        System.out.println("Odd count: " + oddCount);

	        sc.close();
	}
}


