package javaTraining;

public class SeatWork3 {

	public static void main(String[] args) {
		
		//Without Arguments
		CarInfo carObject1 = new CarInfo();
		carObject1.setString("ABC-1234","Black","Toyota Fortuner","SUV","Broken left tail light, tinted windows",
							 "Cebu City, near Fuente Osmeña Circle","Suspected involvement in hit-and-run incident",
							 2022);
		carObject1.printScreen();
		
		
		//With Parameters
		CarInfo carObject2 = new CarInfo("XYZ-5678","White","Honda CR-V","SUV","Scratches on the right door, roof rack installed",
										 "Mandaue City, near Parkmall","Reported stolen, possibly heading toward Consolacion",2021);
		carObject2.printScreen();
	}

}
