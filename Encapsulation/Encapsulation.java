class Student{

	// using private keyword 

	private String name;
	private int age;
	private int roll;

	// Creating the setter;

	void setName(String name){
	this.name= name;	
					} 

	
	void setAge(int age){
	this.age= age;	
					}

	
	void setRoll(int roll){
	this.roll= roll;	
					}



	//Creating Setters


	String getName(){return name;}

	int getAge(){return age;}
	
	int getRoll(){return roll;}
	
}

class Encapsulation{
	public static void main(String arg[]){
	
	// Creating an object of class Student
	Student student = new Student ();
	
	// Initializing the values by Setter Methods

	student.setName("Ahmed");
	student.setAge(19);
	student.setRoll(053225);


	// displaying the details by using getter Methods
	
	System.out.println("The Name of the Studendt : "+ student.getName());

	System.out.println("The Age of the Studendt : "+ student.getAge());

	System.out.println("The Roll Number of the Studendt : "+ student.getRoll());

		}




}