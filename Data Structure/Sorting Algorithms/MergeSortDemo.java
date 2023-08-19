public class MergeSortDemo {
    public static void main(String[] args) {

        int array[]= {7,6,2,3,8,9,1,5};

        MergeSort(array);

        for(int i:array){
            System.out.print(i);
        }
    }
    static void MergeSort(int array[]){

        int length= array.length;
        if (length<=1){
            return;
        }

        int middle= length/2;
        int [] leftarray=new int [middle];
        int [] rightarray= new int [length-middle];

        int i=0,j=0;
        for(; i<length; i++ ){

                if (i<middle){
                    leftarray[i]=array[i];
                }
                else{
                    rightarray[j]=array[i];
                    j++;
                }

        }

        MergeSort(leftarray);
        MergeSort(rightarray);
        Merge(leftarray,rightarray,array);

    }

    static void Merge(int leftarray[], int rightarray[], int array[]) {

        int length= array.length;
        int leftsize= length/2;
        int rightsize= length-leftsize;

        int i=0,l=0,r=0;

        while (l<leftsize && r<rightsize){

            if (leftarray[l]<rightarray[r]){
                array[i]=leftarray[l];
                i++;
                l++;
            }
            else{
                array[i]=rightarray[r];
                i++;
                r++;
            }

        }

        while(l<leftsize){
            array[i]=leftarray[l];
            i++;
            l++;
        }

        while(r<rightsize){
            array[i]=rightarray[r];
            r++;
            i++;
        }

    }
}
