import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        // Declaration of the linkedlist and arraylist

        LinkedList<Integer> linkedList= new LinkedList<>();
        ArrayList<Integer> arrayList= new ArrayList<>();

        // Declaration of the variables that will be used
        long startTime;
        long endTime;
        long elapsedTime;


        // Adding the values to the linkedlist and arraylist
        for(int i=0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //*********************LinkedList********************

        // Getting the cuurent start time
        startTime= System.nanoTime();

        linkedList.remove(2000);
        linkedList.remove(1500);
        linkedList.remove(1000);

        // Getting the endtime
        endTime= System.nanoTime();

        elapsedTime= endTime-startTime;

        System.out.println("LinkedList : "+ elapsedTime+" ns");

        //*********************ArrayList********************

        // Getting the cuurent start time
        startTime= System.nanoTime();

        arrayList.remove(1000);
        arrayList.remove(2000);
        arrayList.remove(1500);
        // Getting the endtime
        endTime= System.nanoTime();

        elapsedTime= endTime-startTime;

        System.out.println("ArrayList : "+ elapsedTime+" ns");

        //  *****************Result*********************
        // LinkedList is faster than the ArrayList in the Inseting or removing Elements/ items


    }
}
