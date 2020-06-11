package reflections;

import java.lang.reflect.Modifier;
import java.lang.Class;

public class ReflectionTest {
    public static void main(String[] args) {
//        try {
//            Dog dog = new Dog();
//            Class obj = dog.getClass();
//
//            Class[] objInterface = obj.getInterfaces();
//
//            for (Class c : objInterface){
//                System.out.println("Interface Name: "
//                        + c.getName());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            // create an object of Dog class
            Dog d1 = new Dog();

            // create an object of Class using getClass()
            Class obj = d1.getClass();

            // Get the access modifier of Dog in integer form
            int modifier = obj.getModifiers();
            System.out.println("Modifier: " + Modifier.toString(modifier));

            // Find the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());
        }

        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
