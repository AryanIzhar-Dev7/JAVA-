import java.util.Scanner;

class Employee {
    private String name;
    private String last;
    private double monthlySalary;

    //Getters
    String getName(){return this.name;}
    String getLast(){return this.last;}
    double getSalary(){return this.monthlySalary;}


    // Creating Constructor;

    Employee (String name, String last, double salary ){
        this.name= name;
        this.last=last;

        if (salary <0){
            this.monthlySalary=0.0;
        }

        else {
            this.monthlySalary=salary;
        }

   						 }//end of Constructor


	// Creating Copy Constructor
	Employee (Employee em){
	this.name= em.name;
	this.last= last;
	this.monthlySalary= em.monthlySalary;
				} // end of Copy Constructor
}

class EmployeeTask{
    public static void main (String arg[]){

        Scanner scanner= new Scanner (System.in);

        Employee employee[]= new Employee[3];

        for (int i=0; i<employee.length-1; i++){
            System.out.println("Enter the Name of the Employee : ");
            String name= scanner.nextLine();

            System.out.println("Enter the Last Name of the Employee : ");
            String last= scanner.nextLine();

            System.out.println("Enter the Salary of the Employee : ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employee[i]= new Employee(name,last,salary);
      	    } // end of for loop 

	    employee[2]=new Employee (employee[1]);


	//displaying the yearly Salary;
	System.out.println("*****************Monthly Salary***************** ");
	System.out.println();

	for (int a=0; a<employee.length; a++){
	System.out.println("The Monthly Salary of Employee "+ employee[a].getName() + " : " + employee[a].getSalary());
			}

	// Giving 10% raise to Each of the Employee
	
	System.out.println();
	System.out.println("*****************Yearly Salary***************** ");
	
	System.out.println();

	for (int x=0; x<3; x++){
	double sal= employee[x].getSalary();

	sal = sal+ (sal*0.1); 
	System.out.println("The Yearly Salary of " +(x+1)+" Employee is : "+ sal*12);	


			}// end of for 
	
 

    }
}