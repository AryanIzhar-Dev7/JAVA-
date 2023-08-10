public class BinarySearchDemo {
    public static int binarySearch(int [] arr, int searchnumber){

        int middle=0;
        int low=0;
        int high=arr.length-1;


        while(low<=high){
            middle= (low+high)/2;
            int middlenumber=arr[middle];

            if (middlenumber==searchnumber){

                return middle;
            } else if (middlenumber<searchnumber) {
                low=middle+1;
            }
            else {
                high=middle-1;
            }


        }


        return -1;
    }
    public static void main(String[] args) {

        int arr[]= {1,3,5,7,9,11,13,15,17,19,20};
        int numbertofind=10;
        int index=binarySearch(arr,numbertofind);

        if (index!=-1){
        System.out.println("The Number " + numbertofind + " is found on the Index number "+index); }
        else{
            System.out.println("The Number is not found ");
        }

    }
}
