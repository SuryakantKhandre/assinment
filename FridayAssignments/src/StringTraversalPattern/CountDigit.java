package StringTraversalPattern;

public class CountDigit {
	public static void main(String[] args) {
		// Count Digit 
		String s = "WelcomeTo2k26";
		System.out.println(CountDigits(s));

	}
	public static int CountDigits(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='1' && ch <= '9') {
				count++;
			}
		}
		return count;
	}

}
