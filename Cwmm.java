class Employee{
String name;
int id;

public void printDetail(){
System.out.println("The Name is : " + name);
System.out.println("The ID is : " + id);
	}
}

class Cwmm{
	public static void main (String args[]){
	Employee itachi=new Employee(); //Creating an Object of Class Employee :

	itachi.name="Itachi Uchiha";// Initializing the name ;
	itachi.id=100; // Initializing the ID;
	itachi.printDetail(); // Calling the function which is the class Employee to Display the attributes of the object Itachi;	

//The Class Employee can be used for multiple Objects. It makes the coding a way easy and we donot have to repeat again & again 
	
	Employee sasuke=new Employee();// Using the Class for another object Sasuke;
	sasuke.name="Sasuke Uchiha ";
	sasuke.id=2341;
	sasuke.printDetail();


	Employee madara=new Employee();// Using the Class for another object madara;
	madara.name="Madara Uchiha ";
	madara.id=23441;
	madara.printDetail();
// I have used the names of the anime character so Donot worry you can use any name you want it was just for understanding;


	}

}





















