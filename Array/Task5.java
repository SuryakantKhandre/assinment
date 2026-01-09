package Array;

public class Task5 {

	public static void main(String[] args) {
		
		// Element at even and odd index
		
		int arr[] = {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println("even index element : "+arr[i]);
			}
			
		}

	}

}
