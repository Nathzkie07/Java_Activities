package javaTraining;
import java.util.*;

public class typeCastingParsing {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);	
			
		System.out.print("Enter your age    :"); 
		String ageString= input.nextLine();		
		int ageInt=Integer.parseInt(ageString);
		double ageDouble=Double.parseDouble(ageString);
		
		System.out.println("Your age as int   :"+ageInt);
		System.out.println("Your age as double:"+ageDouble);
		
		input.close();
	}

}
