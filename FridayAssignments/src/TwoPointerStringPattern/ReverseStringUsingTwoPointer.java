package TwoPointerStringPattern;

public class ReverseStringUsingTwoPointer {
	public static void main(String[] args) {
		System.out.println(reverseStr("Chetan Bhankhede "));

	}
	
	public static String reverseStr(String str) {
		char arr[] = str.toCharArray();  
		int l=0;
		int r=str.length()-1;
		while(l<r) {
			char temp = arr[l];  
			arr[l] = arr[r]; 
			arr[r] = temp;  
			
			r--;
			l++;
		}
		
		
		return new String(arr);
		
	}

}
