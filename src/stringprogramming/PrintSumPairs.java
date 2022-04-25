package stringprogramming;

public class PrintSumPairs {

	public static void main(String[] args) {
		 int arr[] = { 1, 5, 7, -1, 5 ,0,6};
		 
		 int sum = 6;

		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]+arr[j]==sum) {
					 System.out.println(arr[i]+"  "+arr[j] +" at index "+ i +" and "+j);
				 }
			 }
		 }
	}

}
