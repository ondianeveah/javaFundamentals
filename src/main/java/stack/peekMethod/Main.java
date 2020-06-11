package stack.peekMethod;

import java.util.Stack;

//The peek() method returns an object from the top of the stack.
public class Main {
    public static void main(String[] args) {
        Stack<String> people = new Stack<>();

        //Add Elements
        people.push("Ondia");
        people.push("Maddy");
        people.push("Bob");
        System.out.println("Initial Stack: " + people);

        //Access Element from top of stack
        String element = people.peek();
        System.out.println("Element at top: " + element);
    }
}
