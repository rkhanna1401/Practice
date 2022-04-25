package stringprogramming;

public class PrimeNumberTest {

	static boolean numberTest(int num) {

		if(num == 1 || num == 0) {
			return false;
		}
		if(num == 2) {
			return true;
		}
			for(int i=2;i<=num/2;i++) {
				if(num%i ==0) {
					return false;
				}
			}
			return true;
	}

	public static void main(String[] args) {
		System.out.println(numberTest(1));
		System.out.println(numberTest(11));
		System.out.println(numberTest(2));
		System.out.println(numberTest(10));
	}

}
