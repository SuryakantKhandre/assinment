package Array;

public class Task3 {
	public static void main(String[] args) {
		// Count even numbers and odd numbers
		
		int arr[] = {1,2,3,4,5};
		
		int count =0;
		int oddcount = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}else {
				oddcount++;
			}
		}
		
		System.out.println("Number of even number : "+count);
		System.out.println("Number of odd number : "+oddcount);
		

	}

}
