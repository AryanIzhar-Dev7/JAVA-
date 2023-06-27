class LabelledLoopDemo{
	public static void main (String args[]){
	

	external_loop: // labelling the outer loop
	for (int i=0; i<10; i++){

		internal_loop:
		for (int x=0; x<8; x++){
			System.out.println(i + "\t"+ x);
			if (i==3)
			break external_loop;// because the loops are labelled the external loop will be terminated;		

				} // end of internal loop
			
		System.out.println();
	}// end of External loop
	
		}




}