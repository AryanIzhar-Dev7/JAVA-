class House{
	int rooms;
	int kitchen;
	int tv;
}

class HouseDemo{
	public static void main(String artgs[]){
	
	//Creating the object of House class
	House house= new House();
	
	//Refering the object of hourse class by house1
	House house1= house;

	//Initializing the class House using house1;
	
	house1.rooms= 4;
	house1.kitchen=1;
	house1.tv=2;
	
	// Displaying the Class House 
	System.out.println("The Number of Rooms are : "+ house.rooms  );
	System.out.println("The Number of Kitchen is : "+ house.kitchen  );
	System.out.println("The Number of Televisions are : "+ house.tv  );


}





}