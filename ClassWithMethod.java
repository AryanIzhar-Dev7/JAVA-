class Employee{
String name;
int id;

public void printDetail(){
System.out.println("The Name is : " + name);
System.out.println("The ID is : " + id);
	}
}

class ClassWithMethod{
	public static void main (String args[]){
	Employee itachi=new Employee(); //Creating an Object of Class Employee :

	itachi.name="Itachi Uchiha";// Initializing the name ;
	itachi.id=100; // Initializing the ID;
	itachi.printDetail(); // Calling the function which is the class Employee to Display the attributes of the object Itachi;	

	}

}