package stringprogramming;

public class PrintPrime {

	public static void main(String[] args) {
		int count;
		for(int j=2;j<100;j++) {
			count=0;
			for(int i=1;i<=j;i++) {  
				if(j%i==0)
				{
					count++;        
				}
			}

			if(count ==2) {
				System.out.println(j);
			}
		}


	}

}
