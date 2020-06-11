package instanceOf;

public class InstanceOfInheritance {
    //Make Animal Class
    //Make Dog Class
    //Main Class

    public static class Animal {
        protected String type="Ondia";

        public void displayInfo(){
            System.out.println("I am an animal.");
        }

        Animal(){
            System.out.println("I am an animal.");
        }

        Animal(String type){
            System.out.println("Type: " + type);
        }
    }

    public static class Dog extends Animal {
        public void displayInfo(){
            System.out.println("I am a dog.");
        }

        public void display(){
            System.out.println("I am a dog.");
        }

        public void printMessage(){
            display();
        }

        public String type="mammal";

        public void printType() {
            System.out.println("I am a " + type + ".");
            System.out.println("I am an " + super.type + ".");
        }

        public Dog(){
            super("Animal");
            System.out.println("I am a dog.");
        }
    }

    public static class Cat{

    }

}
