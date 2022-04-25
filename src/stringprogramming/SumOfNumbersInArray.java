package stringprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SumOfNumbersInArray {


	//Find numbers in an array whose sum is equal to the number pointed by current index of array

	public static void main(String[] args) {
		int[] intArray = new int[]{ 10,2,3,4,5,5,7,8,9,10 }; 
		Integer[] array = new Integer[]{ 10,2,3,4,5,5,7,8,9,10 }; 
		sum(9,intArray);
		ArrayList<Integer> al = new ArrayList<Integer>();
		Collections.addAll(al, array);
	}

	public static void sum(int index, int[] array) {

		int result = array[index];
		//		for(int i =0 ; i<array.length-1;i++) {
		//			int	add = array[i] + array[i+1];
		//			if(add==result) {
		//				System.out.println("Positions are: " +i + " and "+(i+1));
		//			}
		//			
		//		}

		Set<Integer>  s = new HashSet<Integer>();
		for(int val : array) {
			int var = result - val;
			if(!s.contains(var)) {
				s.add(val);
			}
			else {
				System.out.println(val+ "  "+var);
			}
		}
	}

}
