package activity6;

/**
** This an abstract class with attributes
** - numberOfWheels
** - brand
** and methods
** - a concrete method destroy()
** - an abstract method startEngine()

*/
public abstract class Vehicle {

	private final int numberOfWheels;
    private final String brand;

    public Vehicle(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    // Abstract method to be implemented by subclasses
    public abstract void startEngine();

    // Concrete method
    public void destroy() {
        System.out.println(brand + " is destroyed.");
    }

    @Override
    public String toString() {
        return String.format("%s - %d wheels", brand, numberOfWheels);
    }


}