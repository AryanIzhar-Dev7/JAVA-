class StaticBlockCode{

	static int i=0;
	static int j=10;
		
	public static void main(String args[]){

	System.out.println("I am called after Static Block of Code ");	
	

		}

	//Static Block code it will be called the exact moment when program will be loaded into memory;
	
	static {
		i=120;
		j=110;
		System.out.println("The Static Block of Code is Called First ");
		System.out.println("The Value of I is changed now : "+ i  + "  and also of j : " + j);		}

}