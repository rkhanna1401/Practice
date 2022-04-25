package stringprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {


	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();

		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 178);
		scores.put("Dino", 65);

		sort(scores);
	}

	private static void sort(Map<String, Integer> scores) {
		Map<String, Integer> sortedScores = new LinkedHashMap<>();
		Set<Entry<String, Integer>> set = 	scores.entrySet();
//		set.parallelStream().sorted((x,y) -> x.getValue().compareTo(y.getValue()));
		
		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
//		list.sort((a,b) -> a.getValue().compareTo(b.getValue()));
		list.sort((a,b) -> a.getKey().compareTo(b.getKey()));
		for(Entry<String, Integer> e : list) {
			sortedScores.put(e.getKey(), e.getValue());
		}
		System.out.println(sortedScores);
	}

}
