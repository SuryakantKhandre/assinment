package Array;

public class Task6 {
	public static void main(String[] args) {
		
		// Count how many positive number present in array
		int arr[] = {1,-2,-3,4,-6};
		int count=0;
		int count1=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > 0) {
				count++;
			}
			
			if(arr[i]<0) {
				count1++;
			}
		}
		
		System.out.println("Number of positive number : "+count);
		System.out.println("Number of negative number : "+count1);

	}

}
