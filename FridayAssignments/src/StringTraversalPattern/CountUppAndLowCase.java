package StringTraversalPattern;

public class CountUppAndLowCase {
	public static void main(String[] args) {
		// Count Upper and lower character
		String s ="WelCome";
		CountUpperLowers(s);

	}
	
	
	public static void CountUpperLowers(String str) {
		int UpperCount=0;
		int LowerCount =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >='A' && ch <='Z') {
				UpperCount++;
			}else if(ch >= 'a' && ch <= 'z') {
				LowerCount++;
			}
		}
		
		System.out.println("Upper Count : "+UpperCount);
		System.out.println("Lower Count : "+LowerCount);
	}

}
