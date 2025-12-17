package m3_activity2;

import java.util.*;

public class mainApplication {

	static Set<String> products = new HashSet<>(Arrays.asList("Laptop", "Monitor", "Mouse", "Keyboard", "Printer"));
	static Scanner scanner = new Scanner(System.in);
	static boolean loopin = true;
	
	public static void main(String[] args) {
				
		while (loopin) {
		
		System.out.println("\nSelect an option:\n1. Search a product\n2. Add a product\n3. Print all products and count\n4. Exit");
		
		System.out.print("> ");
		String inputTransaction = scanner.nextLine();
		
		performTransaction(inputTransaction);	
		
		}
		scanner.close();
		
	}
	public static void performTransaction(String input) {
		
		if (input.equals("1")) {
			searchProduct();		
		}else if (input.equals("2")) {
			addProduct();
		}else if (input.equals("3")) {
			printProduct();
		}else if (input.equals("4")) {
			System.out.println("Good Bye!");
			loopin=false;
		}else {
			System.out.println("Invalid Input");
		}		
		
	}
	public static void searchProduct() {
		System.out.print("Enter product name to search: ");	
        String searchItem = scanner.nextLine();
        
        if (products.contains(searchItem)) {
            System.out.println("Product Found: "+searchItem);
        } else {
            System.out.println("Product Not Found!");
        }
	}
	public static void addProduct() {
		System.out.print("Add a product name to add: ");
		String addItem = scanner.nextLine();
		
		products.add(addItem);
		
		System.out.println("Product added: "+addItem);
		
		
	}
	public static void printProduct() {
		
		System.out.println("\nAll products:");
		
		for (String prod : products) {
			System.out.println(prod);
		}
		
		System.out.println("Total unique products: "+products.size());
			
	}

}