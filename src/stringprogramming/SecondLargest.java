package stringprogramming;

import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };

		TreeSet<Integer> ts = new TreeSet();
		for(int i =0; i<arr.length;i++) {
			ts.add(arr[i]);
		}
		System.out.println(ts.descendingIterator().next());

	}

}
