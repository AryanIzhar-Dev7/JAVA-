class House{
	int rooms;
	int kitchen;
	int tv;

	House(int rooms, int kitchen, int tv){
	this.rooms=rooms;
	this.kitchen=kitchen;
	this.tv=tv;
			}

}

class HouseDemoWithConstructor{
	public static void main(String artgs[]){
	
	//Creating the object of House class and initializing by constructor
	House house= new House(4,1,2);
	

	// Displaying the Class House 
	System.out.println("The Number of Rooms are : "+ house.rooms  );
	System.out.println("The Number of Kitchen is : "+ house.kitchen  );
	System.out.println("The Number of Televisions are : "+ house.tv  );


	}
}