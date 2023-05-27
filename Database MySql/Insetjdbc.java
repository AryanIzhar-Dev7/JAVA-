import java.sql.*;


class Insetjdbc{

	public static void main (String ar[]){

	
	try {

		// Load the driver

		Class.forName("com.mysql.cj.jdbc.Driver");
		// Create a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","624667");


		// Creating Query

	String query = "create table student (ID int(20) primary key auto_increment , Name varchar(250) , City varchar(250) )" ;

		// Create Statement 
	Statement statement = connection.createStatement();

	statement.executeUpdate(query); 
	System.out.println("Table Student is  Created in Database");
	
	// Closing Connectin
	
	connection.close();


	} catch (Exception e){}


	}
}