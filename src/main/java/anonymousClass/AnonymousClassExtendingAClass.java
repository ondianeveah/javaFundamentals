package anonymousClass;

//An anonymous class has to be defined inside another class.
//AKA anonymous inner class
public class AnonymousClassExtendingAClass {
    class Square{
        public void display(){
            System.out.println("Inside the square class");
        }
    }

    class Anonymous{
        public void createClass(){
            Square square = new Square(){
                public void display(){
                    System.out.println("Inside an anonymous class.");
                }
            };
            square.display();
        }
    }
}
