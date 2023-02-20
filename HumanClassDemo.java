// Creating a Class Human;
class Human{
	//All Attributes of the Human;
	String name;
	int age;
	String disability;
	String status;
	String identity;

	//Creating a method for initialization
	void initialize(String n, int a, String D , String S, String I){


		name=n;
		age = a;
		disability = D;
		status=S;
		identity=I;
	}

	//Creating a method for display
	void display(){
		System.out.println("The Name of the human is : " + name);
		System.out.println("The Age of the human is : " + age);
		System.out.println("The Status of the human is : " + status);
		System.out.println("The Disability  of the human is : " + disability );
		System.out.println("The Gender of the human is : " + identity);
	}


}

class HumanClassDemo{
	public static void main ( String args[] ){
	
	Human human=new Human();// Creating an object of the Human class;
	human.initialize("Aryan",22,"No","Rich","Male");// Passing the Values to the initialize method of class human
	human.display(); // Calling the display method of the human;


		}




}