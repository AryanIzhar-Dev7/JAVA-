class Vehicle{

	//Create variable of class

	String type;
	String name;
	int num_people;
	
	
	//Create Method to Display
	void display(){
	System.out.println("The type of the Vehicle is "+ type);
	System.out.println("The Name of the "+ type +" is "+ name);	
	System.out.println("The Number of people It can store " + num_people );	 }
	
	// Create Copy Constructor
	Vehicle (Vehicle v2){
	this.type=v2.type;
	this.name=v2.name;
	this.num_people=v2.num_people;
	}

	// Create another constructor for anther object v1; 
	Vehicle(){	};

}

class DemoOfConstructor{

	public static void main (String arg[]){
	// Create Object of Class
	Vehicle v1= new Vehicle ();

	v1.type="Car";
	v1.name="Toyota";
	v1.num_people=4;
		
	//Create another object for v2;
	Vehicle v2 = new Vehicle (v1);
	v2.display();	
	}



}