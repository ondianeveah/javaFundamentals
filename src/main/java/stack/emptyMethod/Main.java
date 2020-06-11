package stack.emptyMethod;

import java.util.Stack;

//To check whether a stack is empty or not, we use the empty() method.

public class Main {
    public static void main(String[] args) {
        Stack<String> people = new Stack<>();

        //Add Elements
        people.push("Ondia");
        people.push("Maddy");
        people.push("Bob");
        System.out.println("Stack: " + people);

        //Access Element from top of stack
        boolean result = people.empty();
        System.out.println("Is the stack empty: " + result);

    }
}
