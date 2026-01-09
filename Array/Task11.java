package Array;

public class Task11 {
	public static void main(String[] args) {
		
		// difference between min and max
		
		int arr[] = {12,2,13,4,5};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max <= arr[i]) {
				max=arr[i];
			}
			
			if(min >= arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("Difference of two elements : "+(max-min));
		

	}

}
