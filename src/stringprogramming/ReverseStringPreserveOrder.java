package stringprogramming;

public class ReverseStringPreserveOrder {

	
	public static void main(String[] args) {
		String str = "My name is Rishi";
		
		String[] arr= str.split(" ");
		
		String result = "";
		

		char[] initial = str.toCharArray();
		char[] expected = new char[initial.length];
		int i = initial.length-1;
		
		for(int j=0;j<initial.length-1;j++) {
			
			if(initial[j]==' ') {
				i--;
				j++;
			}
			expected[j] = initial[i];
			i--;
		}
		
		System.out.println(expected);
	}
}
