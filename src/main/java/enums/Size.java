package enums;

public enum Size {
    SMALL("SMALl"), MEDIUM("MEDIUM")
    , LARGE("LARGE"), EXTRALARGE("EXTRALARGE");

    private final String shirtSize;

    Size(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public String getSize(){
        switch(this) {
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";

            case LARGE:
                return "large";

            case EXTRALARGE:
                return "extra large";

            default:
                return null;
        }
    }

/*The ordinal() method returns the position of an enum constant. For example,
ordinal(SMALL)
 returns 0*/
  /*The compareTo() method compares the enum constants based on their ordinal value.
  * Size.SMALL.compareTo(Size.MEDIUM)
 returns ordinal(SMALL) - ordinal(MEDIUM)
  *
  * The toString() method returns the string representation of the enum constants.
  * For example,
SMALL.toString()
returns "SMALL"
*/
    /**/
}
