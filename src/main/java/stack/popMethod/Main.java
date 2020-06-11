package stack.popMethod;

import java.util.Stack;
//To remove an element from the top of the stack, we use the pop() method.
//LIFO - Last In
public class Main {

    public static void main(String[] args) {
        Stack<String> people = new Stack<>();

        //Add Elements
        people.push("Ondia");
        people.push("Maddy");
        people.push("Bob");
        System.out.println("Initial Stack: " + people);

        //Remove element
        String element = people.pop();
        System.out.println("Removed Element: " + element);
    }
}
