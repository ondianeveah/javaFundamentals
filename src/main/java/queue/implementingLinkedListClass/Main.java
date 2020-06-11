package queue.implementingLinkedListClass;

import java.util.LinkedList;
import java.util.Queue;

/* Notes
* Each element in a linked list is known as a node and consists of 3 fields
* Prev - Stores an address of the previous element in the list. It is null for the first element.
* Next - Stores an address of the next element in the list. It is null for the last element.
* Data - Stores the actual data.
* Elements in a linked list are not stored in sequence,
* they are scattered and connected through links (Previous and Next)
* Do, Cat, Cow example:
* Dog - it is the first element that holds null as previous address and address of Cat as next address
* Cat - it is the second element that holds an address of Dog as previous address and address of Cow as next address
* Cow - it is the last element that holds the address of Cat as the previous address and null as the next element
*
*
* */


public class Main {
    public static void main(String[] args) {

        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}
