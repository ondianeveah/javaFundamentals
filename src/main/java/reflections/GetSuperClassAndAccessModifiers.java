package reflections;

public class GetSuperClassAndAccessModifiers {

    interface Animal{
        public void display();
    }

    public class Dog implements Animal {
        public void display() {
            System.out.println("I am a dog.");
        }
    }
}
