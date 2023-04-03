class A{
    int i;
}
class B extends A{
    int i;
    B(int x,int y) {
        // Super will refer to the i of the Super Class
        super.i = x;
        // THis is the i of the Sub Class
        i=y;
    }

    void show(){
        System.out.println("The i of the Super Class  :  "+ super.i);
        System.out.println("The i of the Sub Class  :  "+ i);
    }
}

public class SecondUseOfSuperKeyword {
    public static void main(String[] args){

        //Create the object
        B b=new B(12,45);

        // Calling the method in class B
        b.show();
    }
}
