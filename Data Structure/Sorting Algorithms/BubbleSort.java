import java.sql.SQLOutput;

public class BubbleSort {
    public static void main(String[] args) {

        int array[]= {9,1,8,3,6,4,5,2,7};


        bubbleSort(array);


        for(int a:array){
            System.out.print(a);
        }
    }

    static void bubbleSort(int array[]){

        for(int i=0; i<array.length-1; i++){

            for (int j=0; j< array.length-1; j++){

                if (array[j] > array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
    }
}
