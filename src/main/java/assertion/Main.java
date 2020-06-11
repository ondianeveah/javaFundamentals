package assertion;

public class Main {
        public static void main(String args[]) {
            String[] weekends = {"Friday", "Saturday", "Sunday"};
            assert weekends.length == 2;
            System.out.println("There are " + weekends.length + "  weekends in a week");
        }
}
