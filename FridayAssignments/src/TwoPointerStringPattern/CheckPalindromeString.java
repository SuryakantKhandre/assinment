package TwoPointerStringPattern;

public class CheckPalindromeString {
	public static void main(String[] args) {
	
		String str = "ChetannatehC";
		System.out.println(isPalindrome(str));

	}
	
	public static boolean isPalindrome(String str) {
	
		boolean isPalidrom=false;
		str = str.toLowerCase();
		int left=0; int right = str.length()-1;
		while(left<right) {
			
			if(str.charAt(left) == str.charAt(right)) {
				System.out.println(str.charAt(left) +" = "+ str.charAt(right));
				isPalidrom= true; 
			}else {
				
				return false;
			}
			left++; 
			right--; 
		}
		return isPalidrom;  
	}

}
