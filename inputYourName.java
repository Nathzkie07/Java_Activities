package javaTraining;
import java.util.*;

public class inputYourName {

	public static void main(String[] args) {
		
		String name ="";
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("What is your name?:");
			name= input.nextLine();
		}	
		
		System.out.println("Hello "+name+"!");	
	}
}
