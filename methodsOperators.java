package javaTraining;
import java.util.*;

public class methodsOperators {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first Integer:");
		int firstInt= input.nextInt();	
		System.out.print("Enter second Integer:");
		int secondInt= input.nextInt();	
			
		computeResult(firstInt,secondInt); 
		
		input.close();
				
	}
	
	public static void computeResult (int firstInt, int secondInt) {
		
		int sumResult=(firstInt+secondInt);
		int mulResult=(firstInt*secondInt);
		int difResult=(firstInt-secondInt);
		
		System.out.println("Sum:"+sumResult);
		System.out.println("Difference:"+difResult);
		System.out.println("Product:"+mulResult);
	}

}
