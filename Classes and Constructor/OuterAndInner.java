class Outer{

	void outerMethod(){
	System.out.println("Hello! I am Outer Class ");
		}

	class Inner{
		void innerMethod(){
	System.out.println("Hey There! I am Inner Class "); 
				}
			}

}

class OuterAndInner{
	public static void main (String args[]){

	// Creating an object for outer class;
	Outer outer= new Outer();

	// Callint outer class methd

	outer.outerMethod();

	// Creating the object of inner class
	Outer.Inner inner= outer.new Inner();
	
   	//Calling Mthod of Inner Class
	inner.innerMethod();
	
	

			}

}