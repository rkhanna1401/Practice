package stringprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExamples {

	public static void main(String[] args) {
		List<Character> ch = new ArrayList<Character>();
		ch.add('a');
		ch.add('b');
		ch.add('c');
		ch.add('c');
		findDistinctFromList(ch);
	}

	static void findDistinctFromList(List<Character> ch) {

		Stream<Character> s = ch.stream().distinct();
		List<Character> list = s.collect(Collectors.toList());
		Iterator<Character> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		list.forEach(System.out::println);
	}
}
