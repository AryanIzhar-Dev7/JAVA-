class LogicalOperator{
	public static void main (String args[]){
	
	int a=10;
	int b=20;
	// This '|' is Logical or operator which will evaluate both conditions even first one is true :
	if (a==10 | ++b==21){

		System.out.println(" OK ");}

	else {  System.out.println("No OK");}

	System.out.println(a+"\t"+b);

	}


}