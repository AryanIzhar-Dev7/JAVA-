import java.util.Scanner;
public class Combination {

    // Method to calculate the combination of the given values
    static int toCombinate(int n,int r){

        // Variables nvalue,rvalue,n_rvalue are used for the ease and calculation

        int nvalue=1;

        for(int i=n;i>=1;i--){

            nvalue= nvalue*i;
        }

        int n_rvalue = 1;
        for (int a=n-r; a>=1; a--){
            n_rvalue*=a;

        }

        int rvalue=1;

        for (int x=r; x>=1; x--){
            rvalue*=x;
        }


        return nvalue/(rvalue*n_rvalue);


    }



    public static void main (String ar[]){

        Scanner scanner = new Scanner(System.in);

        int n=0,r=0;

        // Taking the inputs from the user

        System.out.println("Enter the value of N ");
        n= scanner.nextInt();

        System.out.println("Enter the value of the R ");
        r= scanner.nextInt();


        if (n>=r) {

            // calling the method of the combination
            System.out.println(toCombinate(n, r));
        }
        else
            System.out.println("Invalid input the value of n should be greater than or equal to r ");

    }
}
