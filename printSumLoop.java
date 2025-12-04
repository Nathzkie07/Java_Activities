package javaTraining;

public class printSumLoop {

	public static void main(String[] args) {

		int sumUpTo=50;
		performSum(sumUpTo);
		
	}
	
	public static void performSum(int n) {
		
		int i=1;
		int result=0;
		
		while(i<=50) {		
			result+=i;
			i++;
			
		}

		System.out.println("Sum = "+result);
	
	}

}
