package stringprogramming;

public class Fibonacci {

	static void findSeries(int n) {

		int a =0;
		int b =1;
		int c = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i =0;i< n;i++) {
			a =b;
			b=c;
			c = a+b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		findSeries(5);
	}
}
