import java.sql.SQLOutput;
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
		//Taking Inputs
		
        System.out.println("Enter a String");
        String str1= scanner.nextLine();

        System.out.println("Enter another String");
        String str2= scanner.nextLine();
		
		// Camparing the Strings

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
