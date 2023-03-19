class Car {
	// Instance of Class

	String make;
	String model;
	int year;
	double mileage;
	
	// Making Setters
	void setMake(String make){
	this.make=make;
		}

	void setModel(String model){
	this.model=model;
		}

	void setYear(int year){
	this.year=year;
		}
	void setMileage(double mileage){
	this.mileage=mileage;
		}

	// Making Getters
	String getMake(){ return this.make;}
	String getModel(){ return this.model;}
	int getYear(){ return this.year;}
	double getMileage(){ return this.mileage;}
}

class CarClass{
	public static void main (String ar[]){
		
	Car car= new Car();
	
	// calling the  setters and  getters
	car.setMake("Toyota");	
	car.setModel("Corolla");
	car.setYear(2019);
	car.setMileage(30.4);

	System.out.println("The Maker of the car is : "+ car.getMake());

	System.out.println("The Model of the car is : "+ car.getModel());
	
	System.out.println("The Year in which the car is made : "+ car.getYear());		
	
	System.out.println("The Mileage of the car is : "+ car.getMileage());

}

}