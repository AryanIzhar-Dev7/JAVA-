class DInheritance {
    int i;
    int j;

    DInheritance() {};
    DInheritance(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class SubClass extends DInheritance {
    int z;

    void show()
    {
        System.out.println("z ="+z);
    }

    void display(){

        System.out.println("z= "+z + " i= "+i+ " j= "+j);
    }

    
        }
public class DemoInheritance{

    public static void main(String[] args){
       DInheritance dinher = new DInheritance(12,10);
       SubClass subclass = new SubClass();

       subclass.z=11;
       subclass.show();

       subclass.i=11;
       subclass.j=9;
       subclass.display();

    }
}