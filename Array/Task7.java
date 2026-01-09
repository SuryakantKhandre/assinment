package Array;

public class Task7 {
	public static void main(String[] args) {
		// check weather the number ids present in array
		
		int arr[] = {1,-2,3,4,6,7,-9};
		
		int input = 9;
		boolean check=false;
		
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i] == input) {
				check=true;
			}
		}
		
		if(check) {
			System.out.println("The number is present ");
		}else {
			System.out.println("The number is not present ");
		}

	}

}
