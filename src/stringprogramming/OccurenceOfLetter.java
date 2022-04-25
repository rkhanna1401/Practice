package stringprogramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class OccurenceOfLetter {

	public static void main(String[] args) {
		findOccurence("Rishi Khanna Rishi Khanna Rishi Kumar");
	}

	public static void findOccurence(String letter) {

		String[] arr = letter.split(" ");

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for(String s : arr) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s,1);
			}
		}

		Set<Map.Entry<String, Integer>> set =	map.entrySet();

		for(Map.Entry<String, Integer> m :set) {
			if(m.getValue()>1) {
				System.out.println(m.getKey()+ " "+m.getValue());
			}
		}
	}
}
