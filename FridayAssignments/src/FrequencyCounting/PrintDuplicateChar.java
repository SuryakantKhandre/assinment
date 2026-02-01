package FrequencyCounting;

import java.util.HashMap;

public class PrintDuplicateChar {

	public static void main(String[] args) {
		countFrequencyUsingMap("Banana");
	}
	
	public static void countFrequencyUsingMap(String str) {
		HashMap<Character, Integer> frequency = new HashMap<>();
		
		for(int i = 0; i < str.length() ; i++) {
			
			char ch = str.charAt(i);
				
			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
		}
		
		for(Character ch : frequency.keySet()) {
			System.out.println(ch + " - " + frequency.get(ch));
		}
}

}
