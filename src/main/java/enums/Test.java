package enums;

public class Test {
    Size shirtSize;

    public Test(Size shirtSize) {
        this.shirtSize = shirtSize;
    }

    public void orderShirt() {
        switch (shirtSize) {
            case SMALL:
                System.out.println("I ordered a small shirt.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium shirt.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }
}
