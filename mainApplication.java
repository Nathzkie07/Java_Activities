package m3_activity1;

import java.util.*;

public class mainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> products = new ArrayList<>(Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Printer"));
		
		System.out.println("All Products : ");

		int count = 1;
		for (String p : products) {
		    System.out.println(count++ + ". " + p);
		}
		
		products.add("Webcam");
		products.remove("Mouse");
		
		
		count = 1;
		System.out.println("\nAfter adding and removing products");				

		for (String p : products) {
		    System.out.println(count++ + ". " + p);
		}
		
		
		System.out.print("\nEnter product name to search: ");	
        String searchItem = scanner.nextLine();
        
        if (products.contains(searchItem)) {
            System.out.println("Product Found: "+searchItem);
        } else {
            System.out.println("Product Not Found.");
        }

		scanner.close();
		
	}

}
