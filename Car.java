package activity6;
/*
** This is a concrete class, it is a Vehicle and it is Refuelable
*/
public class Car extends Vehicle implements Refuelable {

	public Car(String brand) {
        super(4, brand);
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
