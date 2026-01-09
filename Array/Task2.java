package Array;

public class Task2 {
	public static void main(String[] args) {
		// Sum of Array Elements
		
		int arr[] = {28,22,85,89,56,44,12,14};
		
		int total=0;
		
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		
		System.out.println("Sum of all Elements : "+total);

	}

}
