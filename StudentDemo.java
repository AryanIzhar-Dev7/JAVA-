// Create A Class Student;
class Student{

String name;
int age;
String education;

	// Creating Method in Class
	 void display(){
	System.out.println("The name of the Student is " + name);
	System.out.println("The Age of the Student is " + age);
	System.out.println("The Class of the Student is " + education);

		
}
	// Creating Constructor of Student Class
Student(String name, int age, String education){
	this.name=name;
	this.age=age;
	this.education=education;
	}
}


class ConstructorDemo{
	
	public static void main (String args[]){
	
	// Creating an object of Student
	Student student=new Student("Itachi Uchiha", 19, "Intermediate" );
	// Calling the method Display
	student.display();
	}	

}