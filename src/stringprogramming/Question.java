package stringprogramming;

public class Question {

	public static void main(String[] args) {

		int a[] = {2,4,3,5,6,11,12,19,1,7};
		int position = 0;
		int first = a[0];
		System.out.println("Value :"+first);
		System.out.println(position);
		for(int i =1;i<a.length-1;i++) {

			if(first < a[i]) {
				position = i;
				first = a[i];   // first = 4
				System.out.println("Value :"+first);
				System.out.println(position);
			}

		}
	}
}
