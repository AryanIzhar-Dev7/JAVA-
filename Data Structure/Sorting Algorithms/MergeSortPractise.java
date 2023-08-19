import java.util.Arrays;

public class MergeSortPractise {
    public static void main(String[] args) {

        int array []= {7,4,5,3,2,9,1,19,13};

        mergeSort(array);

        for(int i:array){
            System.out.print(i+", ");
        }
    }

    static void mergeSort(int array[]){

        int length= array.length;

        if (length<=1){
            return;
        }

        int middle= length/2;
        int leftarray[]= new int [middle];
        int rightarray[]= new int [length-middle];

        int i=0,j=0;
        for(; i<length;i++) {
            if (i < middle){
                leftarray[i]= array[i];
            }
            else{
                rightarray[j]=array[i];
                j++;
            }

        }

        mergeSort(leftarray);
        mergeSort(rightarray);
        merge(leftarray,rightarray,array);

    }

    static void merge(int leftarray[],int rightarray[],int array[]){

        int length= array.length;
        int leftsize= length/2;
        int rightsize= length-leftsize;

        int l=0,r=0,m=0;

        while(l<leftsize && r<rightsize){

            if (leftarray[l]<rightarray[r]){
                array[m]=leftarray[l];
                m++;
                l++;
            }
            else{
                array[m]=rightarray[r];
                r++;
                m++;
            }

        }

        while(l<leftsize){
            array[m]=leftarray[l];
            l++;
            m++;
        }
        while(r<rightsize){

            array[m]=rightarray[r];
            r++;
            m++;
        }

    }


}











