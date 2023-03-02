class Student {
	String name;
	double CGPA;
	

	void setStudentData(String name, double CGPA){
	this.name=name;
	this.CGPA=CGPA;

	}

	void showStudentData(){
	System.out.println("The name of the Student is : "+name);
	System.out.println("The CGPA of the Student is : "+CGPA);
		}
}

class PassbyRefDemo{
	public static void main (String args[]){
	
		Student student= new Student ();
		student.showStudentData();
		updateStudent(student);
		student.showStudentData();

		student.setStudentData("Awais",3.0);
		student.showStudentData();
		}

	static void updateStudent(Student student){
		student.setStudentData("Abdul Samad",3.5);
		}


}