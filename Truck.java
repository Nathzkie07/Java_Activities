package activity6;

/*
** This is a concrete class, it is a Vehicle and it is Refuelable
*/
public class Truck extends Vehicle implements Refuelable {

	public Truck(String brand) {
        super(6, brand); // example: a 6-wheel truck
    }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " car engine started.");
    }

    @Override
    public void refuel() {
        System.out.println(getBrand() + " car refueled.");
    }

}
