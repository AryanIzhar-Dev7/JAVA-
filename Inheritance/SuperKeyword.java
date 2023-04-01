class Persons{
    String name;
    String caste;

    Persons(String name, String caste) {
        this.name = name;
        this.caste=caste;
    }

    Persons(){
        this.name=null;
        this.caste=null;
    }

}
class Employee extends Persons{

    String branch;
    int id;

    Employee (String name, String caste ,String branch, int id){
        super(name,caste);
        this.branch=branch;
        this.id=id;
    }

    void display(){
        System.out.println("Name :"+name);
        System.out.println("Caste :"+caste);
        System.out.println("Branch :"+branch);
        System.out.println("Id :"+id);
    }
}

public class SuperKeyword {
    public static void main (String[] args){

        // Creating the objects
        Employee employee= new Employee("John","Watson","Tesla",9876);
        Employee employee2= new Employee("Jeniffer ","Watson","Nasa",98765);

        //displaying the details of the employee
        employee.display();
        employee2.display();


    }

}
