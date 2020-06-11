package queue.dequeue.arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();

        names.offer("Ondia");
        names.offer("Neveah");
        names.offer("Brown");
        System.out.println("Deque" + names);

        String firstElement = names.peekFirst();
        System.out.println("First Element: " + firstElement);

        String lastElement = names.peekLast();
        System.out.println("Last Element: " + lastElement);

        String removedFirstName = names.pollFirst();
        System.out.println("Removed First Element: " + removedFirstName);

        String removedLastName = names.pollLast();
        System.out.println("Removed Last Element: " + removedLastName);

        System.out.println("Updated Deque: " + names);
    }
}
