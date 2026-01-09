package Array;

public class Task4 {
	public static void main(String[] args) {
		// Find maximum number
		
		int arr[] = {100,2,9,4,5};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max <= arr[i]) {
				max=arr[i];
			}
			
			if(min >= arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
