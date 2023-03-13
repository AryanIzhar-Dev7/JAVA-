class Car{
	String brand;
	int speed;
	int capacity;

	Car(){

		};

	Car(String name){
	this.brand= name;
				}


	Car (String name, int speed){
	
	this.brand =name;
	this.speed= speed;
	
					}
	Car (String name, int speed, int capacity){
	this.brand= name;
	this.speed= speed;
	this.capacity= capacity;

						}

	void display(){
	System.out.println("The Brand is : " +brand);
	System.out.println("The Max Speed is : " +speed);	
	System.out.println("The Person Capacity is : " +capacity);

		}


}

class ConstructorOverloading{
	public static void main (String atg[]){
	
		
	System.out.println("*********Displaying Default constructor Details*********");
	

	// This will call the default / no parameter Constructor
	Car car = new Car();
	car.display();
	
	System.out.println("*********Displaying One Parameter constructor Details*********");
		
	// This will call the one parametered Constructor 
	Car car1= new Car("Ford");
	
	car1.display();
	
	System.out.println("*********Displaying Two Parameter constructor Details*********");
	
	// This will call the two parametered Constructor 
	Car car2= new Car("Ford",472);
		
	car2.display();


	System.out.println("*********Displaying Three Parameter constructor Details*********");
	// This will call the one parametered Constructor 
	Car car3= new Car("Bugati",490,2 );
	car3.display();







			}




}