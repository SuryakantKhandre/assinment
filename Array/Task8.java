package Array;

public class Task8 {
	public static void main(String[] args) {
		
		// count occurrence of an element
		
		int arr[] = {1,2,3,2,3,9,3};
		
		int input=2;
		int count =0;
		
		for(int i=0;i<arr.length;i++) {
			if(input==arr[i]) {
				count++;
			}
		}
		
		System.out.println(count);

	}


}
