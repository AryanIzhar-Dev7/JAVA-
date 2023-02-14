class Vechile{
String name;
int passenger;
int mpl;

}

class VechileDemo{
	public static void main (String args[]){
	Vechile car1= new Vechile(); // Creating an object ;
	Vechile car2 = car1; // assigning car2 location of car1. Now car1 and car2 refers to the same object;
	

	car1.name="Toyota ";
	car1.passenger= 4; 
	car1.mpl=12;

	// Using the object car2 to display things : 

	System.out.println ("The Name of the Car is : "+car2.name);
	System.out.println ("The Number of the Passenger it can take : "+car2.name);
	System.out.println ("The MPL of the Car : " + car2.mpl);

	}

}