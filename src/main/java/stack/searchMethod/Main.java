package stack.searchMethod;

import java.util.Stack;

 //To search an element in the stack, we use the search() method.
 // It returns the position of the element from the top of the stack.
public class Main {
    public static void main(String[] args) {
        Stack<String> people = new Stack<>();

        //Add Elements
        people.push("Ondia");
        people.push("Maddy");
        people.push("Bob");
        System.out.println("Stack: " + people);

        //Access Element from top of stack
        int position = people.search("Ondia");
        System.out.println("Position of Ondia: " + position);

        // Add elements to Stack
        // Stack<String> animals= new Stack<>();
//        animals.push("Dog");
//        animals.push("Horse");
//        animals.push("Cat");
//        System.out.println("Stack: " + animals);
//
//        // Search an element
//        int position = animals.search("Dog");
//        System.out.println("Position of Dog: " + position);
    }
}
