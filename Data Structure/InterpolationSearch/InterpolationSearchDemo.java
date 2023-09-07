

public class InterpolationSearchDemo {
    public static void main(String[] args) {

        int array[]= {1,2,4,8,16,32,64,128,256,512,1024,2048};

        int findnumber=512;
        int index= binarySearch(array,findnumber);

        if (index !=-1){
            System.out.println("The Number is found on the index : " + index);
        }
        else{
            System.out.println("The Nubmer is not found ");
        }
    }

    private static int binarySearch(int[] array, int findnumber) {

        int high=array.length-1;
        int low=0;

        while (findnumber>=array[low] && findnumber<=array[high]&& low<=high){


            int probe= low+(high-low)*(findnumber-array[low])/
                    (array[high]-array[low]);

            System.out.println("Trying Probe : "+probe);

            if(findnumber==array[probe]) {
                return probe;

            }else if (findnumber>array[probe]){
                low=probe+1;

                }
            else{
                high=probe-1;
            }
        }
        return -1;
    }
}
