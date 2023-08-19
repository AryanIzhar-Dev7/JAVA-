public class MergeSortPractise2 {
    public static void main(String[] args) {

        int array []= {12,5,3,7,89,2,3,1,44};


        mergeSort(array);

        for(int i:array){
            System.out.print(i+", ");
        }
    }
    static void mergeSort(int [] array){

        int length= array.length;

        if (length<=1)  return;


        int middleindex= length/2;
        int leftarray[]= new int [middleindex];
        int rightarray[]=new int [length-middleindex];

        int j=0;

        for(int i=0; i<length; i++){

            if (i<middleindex){
                leftarray[i]= array[i];
            }
            else {
                rightarray[j]= array[i];
                j++;
            }
        }

        mergeSort(leftarray);
        mergeSort(rightarray);
        Merge(leftarray,rightarray,array);
    }


    static void Merge(int [] leftarray, int [] rightarray, int [] array){

        int leftarraysize= leftarray.length;
        int rightarraysize= rightarray.length;

        int r=0; int l=0; int i=0;

        while(l<leftarraysize && r<rightarraysize){

            if (leftarray[l]<rightarray[r]){
                array[i]=leftarray[l];
                i++; l++;
            }
            else{
                array[i]=rightarray[r];
                r++; i++;
            }
        }

        while(l<leftarraysize){
            array[i]= leftarray[l];
            l++;
            i++;
        }

        while(r<rightarraysize){
            array[i]=rightarray[r];
            r++; i++;
        }





    }
}


