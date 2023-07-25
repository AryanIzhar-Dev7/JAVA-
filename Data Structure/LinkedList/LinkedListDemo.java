import java.util.LinkedList;

public class LinkedListDemo {
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


        // printing the items of linkedlist
        System.out.println(linkedList);

        //removing the items from linkedlist
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());

        // printing the items of linkedlist
        System.out.println(linkedList);

    }
}
