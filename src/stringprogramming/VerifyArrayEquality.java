package stringprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerifyArrayEquality {

	static boolean equality1(Integer a[], Integer b[]) {
		if(a.equals(b)) {
			return true;
		}
		else {
			return false;
		}
	}

	static boolean equality2(Integer a[], Integer b[]) {
		if(a == b) {
			return true;
		}
		else {
			return false;
		}
	}


	static boolean equality3(Integer a[], Integer b[]) {
		List<Integer> l1 = Arrays.asList(a).stream().distinct().collect(Collectors.toList());
		List<Integer> l2 = Arrays.asList(b).stream().distinct().collect(Collectors.toList());;
		boolean flag = false;
		for(int in : l1) {
			if(l1.size() != l2.size()) {
				break;
			}
			if(l2.contains(in)) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Integer a[] = {1,2,3};
		Integer b[] = {1,3,3};
		System.out.println(equality1(a, b));
		System.out.println(equality2(a, b));
		System.out.println(equality3(a, b));
	}

}
