import java.util.LinkedList;

public class LinkedListAddRemove {
    public static void main(String[] args) {

        //LinkedList is a data structure which store the data with address like [data|address] it takes two blocks
        // we can use linkedlist as a stack or queue

        LinkedList<String> linkedList= new LinkedList<>();

        //Using linlkedlist as a Stack
        // adding items to linkedlist

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        // Printing the Linkedlist
        System.out.println(linkedList);



        // Addint an item on the 4th Position/index
        linkedList.add(4,"E");

        // Adding an item on the 2nd position/index
        linkedList.add(2,"Q");

        // Printing the Linkedlist
        System.out.println(linkedList);


    }
}
