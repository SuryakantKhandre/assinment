package TwoPointerStringPattern;

public class CheckPalindrmIgnoringSpecChar {
	public static void main(String[] args) {
		System.out.println(isPalindromeIgnoringSpecialChar("mad!am#"));
	}
	
	public static boolean isPalindromeIgnoringSpecialChar(String str) {
		
		String newstr=" ";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
				newstr = newstr+ch;
			}
		}
		str = newstr.replaceFirst("\\s", ""); 
		
		
		boolean isPalidrom=false;
		
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
