public class SelectionSorting {
    public static void main(String[] args) {

        int array [] = {9,1,7,2,6,4,3,5,8};

        selectionSort(array);

        for(int i : array){
            System.out.print(i);
        }

    }
    static void selectionSort(int [] array){

        int min, temp;
        for (int i=0; i< array.length; i++){
            min=i;
            for (int j=i+1; j< array.length; j++){
                if (array[min]>array[j]){
                    min=j;
                }

            }
            temp=array[i];
            array[i]=array[min];
           array[min]=temp;

        }

    }
}
