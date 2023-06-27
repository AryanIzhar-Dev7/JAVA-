import java.util.InputMismatchException;
import java.util.Scanner;
public class Permutaion {


    // Creating Method that will compute the permutation
    static int permuation(int n,int r){

        //  Variables nvalue,rvalue and factorial value are just variables that used for ease and computation

        int nvalue=1;

        for (int i=n; i>=1; --i){

            nvalue= nvalue*i;
        }


        int rvalue=1;

        int factorialvalue=n-r;
        for (int x=factorialvalue; x>=1; --x){
            rvalue=rvalue*x;
        }

        return nvalue/rvalue;
    }
    public static void main (String ar[]){

        //creating object of the scanner

        Scanner scanner = new Scanner(System.in);

         // Declaring the varaibles that will be used in the rest of the program
        String cont;
        int n=0,r=0;

        // using the Do While loop for Computing the Permutation repeatedly
        do {
            System.out.println("Enter the value of n ");
            n= scanner.nextInt();


            System.out.println("Enter the value of r ");
            r=scanner.nextInt();

            if (n > r) {
                System.out.println(permuation(n, r));
            } else {
                System.out.println("Invalid Input ");
            }

            System.out.println("Do You Want to Calculate Again");
            scanner.nextLine();
            cont= scanner.nextLine();

        } while ( cont.equals("Yes")|| cont.equals("yes") );

    }
}
