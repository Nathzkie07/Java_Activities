package javaTraining;

public class CarInfo {
	
	private String plateNumber, color, model, type, distinctFeatures, lastSeenLoc, addNotes;
	private int year;
	
	public CarInfo() {
			
	}

	public CarInfo(String plateNumber, String color, String model,String type,String distinctFeatures,
			  String lastSeenLoc, String addNotes, int year) {
		
		this.plateNumber=plateNumber;
		this.color=color;
		this.model=model;
		this.type=type;
		this.distinctFeatures=distinctFeatures;
		this.lastSeenLoc=lastSeenLoc;
		this.addNotes=addNotes;
		this.year=year;		
	}	
	

	public void setString(String plateNumber, String color, String model,String type,String distinctFeatures,
						  String lastSeenLoc, String addNotes, int year) {
		
		this.plateNumber=plateNumber;
		this.color=color;
		this.model=model;
		this.type=type;
		this.distinctFeatures=distinctFeatures;
		this.lastSeenLoc=lastSeenLoc;
		this.addNotes=addNotes;
		this.year=year;
		
	}
	
	public String getPlateNumber() { return plateNumber; }		
	public String getColor() { return color; }		
	public String getModel() { return model; }
	public String getType() { return type; }
	public String getDistinctFeatures() { return distinctFeatures; }
	public String getLastSeenLoc() { return lastSeenLoc; }
	public String getAddNotes() { return addNotes; }
	public int getYear() { return year; }
		
	public void printScreen() {
		System.out.println("Plate Number: "+plateNumber);
		System.out.println("Color: "+color);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Type: "+type);
		System.out.println("Distinctive Features: "+distinctFeatures);
		System.out.println("Last Seen Location: "+lastSeenLoc);
		System.out.println("Additional Notes: "+addNotes+"\n");
		
	}
	
}
