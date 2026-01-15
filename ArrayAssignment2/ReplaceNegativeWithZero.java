package ArrayAssignment2;

public class ReplaceNegativeWithZero {
public static void main(String[] args) {
	// Replace all negative elements in the array with 0 and print the updated array.

		
		int arr[] = {-14,25,-9,27,17,-23,98,99,55,-47,32,-19,0,28,78}; 
		
		for(int a : arr) {
			if(a < 0) {
				a=0;
			}
			System.out.print(a+" , ");
		}

	}

}
