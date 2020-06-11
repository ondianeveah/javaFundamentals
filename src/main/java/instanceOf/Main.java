package instanceOf;

public class Main {
    public static void main(String[] args) {
        InstanceOfInheritance.Dog dog = new InstanceOfInheritance.Dog();
////        InstanceOfInheritance.Animal animal = dog;
//        animal.displayInfo();
        InstanceOfInheritance.Animal animal1 = dog;
        if (animal1 instanceof InstanceOfInheritance.Dog){
            InstanceOfInheritance.Dog dog2 = (InstanceOfInheritance.Dog)animal1;
            dog2.displayInfo();
        }
        InstanceOfInheritance.Animal animal = new InstanceOfInheritance.Animal();
//        InstanceOfInheritance.Dog dog1 = (InstanceOfInheritance.Dog)animal;
//        dog1.displayInfo();
        InstanceOfInheritance.Cat cat = new InstanceOfInheritance.Cat();
//        System.out.println("Is dog an instance of Dog: " + (dog instanceof InstanceOfInheritance.Dog));
//        System.out.println("Is dog an instance of Animal " + (dog instanceof InstanceOfInheritance.Animal));

        System.out.println("Is d1 an instance of the Object class: "+ (dog instanceof Object));
 //       System.out.println("Is a1 an instance of the Object class: "+ (animal instanceof Object));

        System.out.println("Is c1 an instance of the Object class: "+ (cat instanceof Object));

    }
}
