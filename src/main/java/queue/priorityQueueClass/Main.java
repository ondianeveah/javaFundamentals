package queue.priorityQueueClass;

import java.util.PriorityQueue;
import java.util.Queue;



/*
* Priority queue implements Queue
* Queue extends Collection
*
*
*
* */

public class Main {
    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>();

        // offer elements to the Queue
        names.offer("Ondia");
        names.offer("Neveah");
        names.offer("Brown");
        System.out.println("Queue: " + names);

        // Access elements of the Queue
        String accessedName = names.peek();
        System.out.println("Accessed Element: " + accessedName);

        // Remove elements from the Queue
        String removedName = names.poll();
        System.out.println("Removed Element: " + removedName);

        System.out.println("Updated Queue: " + names);

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
    }
}
