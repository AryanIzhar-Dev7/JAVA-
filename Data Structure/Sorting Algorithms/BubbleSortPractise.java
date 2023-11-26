import java.util.Scanner;
public class BubbleSortPractise {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please Enter the Size of the array (1 to 1000) : "  );
        int size= scanner.nextInt();

        // declaring the Array
        int array []= new int[size];

        // Taking input from the user


        for (int a=0; a< array.length; a++){
            System.out.println("Enter the elements of array : ");
            array[a]= scanner.nextInt();
        }

        System.out.println("Before Sorting");
        for (int x: array){
            System.out.print(x);
        }

        System.out.println();

        // Bubble Sorting
        bubbleSort(array);

        System.out.println("After Sorting : ");
        for (int x: array){
            System.out.print(x);
        }

        System.out.println("The Size of the Array : "+ array.length);

    }
        // Method For Bubble Sorting
    static void bubbleSort(int array []){

        for (int a=0; a< array.length-1; a++){
            for(int i=0; i< array.length-1; i++){

                if (array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]= temp;
                }

            }

        }

    }
}
