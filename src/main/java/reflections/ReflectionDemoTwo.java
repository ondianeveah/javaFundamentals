package reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemoTwo {
    public static void main(String[] args) {
        try {
            Dog d1 = new Dog();

            // create an object of Class
            Class obj = d1.getClass();

            // get all the methods using the getDeclaredMethod()
            Method[] methods = obj.getDeclaredMethods();

            // get the name of methods
            for (Method m : methods) {

                System.out.println("Method Name: " + m.getName());

                // get the access modifier of methods
                int modifier = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifier));

                // get the return types of method
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}