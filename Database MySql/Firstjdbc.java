import java.sql.*;


class Firstjdbc{

	public static void main (String ar[]){

	
	try {

		// Load the driver

		Class.forName("com.mysql.cj.jdbc.Driver");
		// Create a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","624667");
	 
		if (connection.isClosed()){
		System.out.println("Connection is Closed");
						}

		else {System.out.println("Connection is Created ");}
		}	catch (Exception e){

		e.printStackTrace();


		}
}
}