class Mobile {
	String type;
	String color;
}

class Android extends Mobile {

	String system;
	String company_name;

}

class InheritanceDemo{
	public static void main (String atgs[]){
		
	// creating object for Android class;
	
	Android android = new Android ();
	
	//accessing the Properties of Mobile class by Android  class

	android.type="Touch";
	android.color="Black";

	// accessing the properties of the Android class itself;

	android.system="Marshmallow";
	android.company_name="Samsung";

	// displaying the properties by using android class;

	System.out.println("The type of the mobile is : "+ android.type);
	System.out.println("The Color of the mobile is : "+ android.color);
	System.out.println("The System Software of the mobile is : "+ android.system);
	System.out.println("The Company name  of the mobile is : "+ android.company_name);



		}


}
