package activity6;

public class MyApplication {

	public static void main(String[] args) {

			Car car = new Car("Toyota");
	        Truck truck = new Truck("Ford");

	        System.out.println("******************************************");
	        
	        System.out.println(car);
	        car.startEngine();
	        car.refuel();

	        System.out.println("******************************************");
	        
	        System.out.println(truck);
	        truck.startEngine();
	        truck.refuel();
	        
	        System.out.println("******************************************");
	        	        
	        destroyVehicle(car);
	        destroyVehicle(truck);
	    }

	    public static void destroyVehicle(Vehicle vehicle) {
	        vehicle.destroy();

		}

	}

