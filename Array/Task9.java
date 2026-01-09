package Array;

public class Task9 {

	public static void main(String[] args) {
		int arr[]= {1,2,-3,4,-5};
		int positiveNumber=0;
				
			for(int i=0; i<arr.length; i++) {
					if(arr[i]>0) {
						positiveNumber++;
						
					}
			
			}
			System.out.println("count : "+ positiveNumber);

	}

}
