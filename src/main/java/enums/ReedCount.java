package enums;

public enum ReedCount {
    NONE("None", 0),
    SINGLE("Single", 1),
    DOUBLE("Double", 2);

    private String countString;
    private int countInt;

    ReedCount(String countString, int countInt) {
        this.countString = countString;
        this.countInt = countInt;
    }

    public String getCountString() {
        return countString;
    }

    public int getCountInt() {
        return countInt;
    }
}
