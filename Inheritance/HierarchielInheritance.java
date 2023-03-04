class Mobile {
	String screen;
	String shape;
	String type;
}

class Android extends Mobile {
	String system_software;
	String color;
	String megapixel;
}

class KeypadPhone extends Mobile {
	String system_software;
	String color;
	String megapixel;
}

class HierarchielInheritance{
	public static void main (String args[]){
	
	//Creating the object of Android class 
	Android android= new Android ();

	//Creating the object of KeypadPhone Class
	KeypadPhone keypadphone = new KeypadPhone();
		
	// initializing the properties of class Mobile and Android by Using only android object;
	android.screen="Touch";
	android.shape="Rectangle";
	android.type="Smartphone";
	android.system_software=" OS 11";
	android.color ="Black";
	android.megapixel="48 Mega Pixel Camera ";
	
	// initializing the properties of class Mobile and KeyPAdPhone by Using only keypadphone object;
	keypadphone.screen="Not Touch Supported Screen ";
	keypadphone.shape="Rectangular with Curve Edges ";
	keypadphone.type="Normal Phone";
	keypadphone.system_software=" S60 ";
	keypadphone.color ="Blakish with Blue Shade ";
	keypadphone.megapixel="2 Mega Pixel Camera ";

	
	// Displaying the properties of the Android Class

	System.out.println("*********************** Android *********************** \n  ");
	System.out.println("The Screen of the Mobile is : "+ android.screen);
	System.out.println("The Shape of the Mobile is : "+ android.shape);
	System.out.println("The Type of the Mobile is : "+ android.type);
	System.out.println("The System Software of the Mobile is : "+ android.system_software);
	System.out.println("The Color of the Mobile is : "+ android.color);
	System.out.println("The Camera  of the Mobile is : "+ android.megapixel);


	// Displaying the properties of the KeypadPhone Class

	System.out.println("\n*********************** KeypadPhone *********************** ");

	System.out.println("The Screen of the Mobile is : "+ keypadphone.screen);
	System.out.println("The Shape of the Mobile is : "+ keypadphone.shape);
	System.out.println("The Type of the Mobile is : "+ keypadphone.type);
	System.out.println("The System Software of the Mobile is : "+ keypadphone.system_software);
	System.out.println("The Color of the Mobile is : "+keypadphone.color);
	System.out.println("The Camera  of the Mobile is : "+ keypadphone.megapixel);


		}
	
	}