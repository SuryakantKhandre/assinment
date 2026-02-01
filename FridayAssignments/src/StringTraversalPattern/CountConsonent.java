package StringTraversalPattern;

public class CountConsonent {
	public static void main(String[] args) {
		// count consonant
		String str = "Hello";
		System.out.println(CountConsonants(str));

	}

	public static int CountConsonants(String str) {
		int Count =0; 
		
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' ) {
				Count++;
			}
		}
		 
		return Count;
	} 
}


