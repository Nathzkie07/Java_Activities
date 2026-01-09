package m3_activity3;

import java.util.*;

public class M3Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		Map<String, Double> products = new HashMap<String, Double>() {{
		    put("Apple", 1.50);
		    put("Banana", 0.80);
		    put("Orange", 1.20);
		    put("Milk", 2.50);
		    put("Bread", 1.00);
		}};


        while (true) {
        	
        	System.out.println("\nSelect an option:\n" +
                   "1. Search a product\n" +
                   "2. Add a product\n" +
                   "3. Print all products and prices\n" +
                   "4. Find the cheapest product\n" +
                   "5. Exit");
            System.out.print("> ");           
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    if (products.containsKey(searchName)) {
                        System.out.println("Product found! Price: ₱" + products.get(searchName));
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 2:
                    System.out.print("Enter product name to add: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double newPrice = scanner.nextDouble();
                    products.put(newName, newPrice);
                    System.out.println("Product added: "+newName);
                    break;

                case 3:
                    System.out.println("\nAll products and prices:");
                    for (Map.Entry<String, Double> entry : products.entrySet()) {
                        System.out.println(entry.getKey() + " - ₱" + entry.getValue());
                    }
                    System.out.println("Total Products: "+products.size());
                    break;

                case 4:
                    String cheapestProduct = null;
                    double minPrice = Double.MAX_VALUE;
                    for (Map.Entry<String, Double> entry : products.entrySet()) {
                        if (entry.getValue() < minPrice) {
                            minPrice = entry.getValue();
                            cheapestProduct = entry.getKey();
                        }
                    }
                    System.out.println("Cheapest product: " + cheapestProduct + " (₱" + minPrice + ")");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
