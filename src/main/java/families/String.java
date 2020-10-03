package families;

import methods.StringMethod;

public abstract class String extends Instrument{

    private int numberOfStrings;
    private StringMethod method;
    private boolean isElectric;

    public String(String material, String colour, double buyingPrice, double sellingPrice, int numberOfStrings, StringMethod method, boolean isElectric) {
        super(material, colour, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
        this.method = method;
        this.isElectric = isElectric;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public StringMethod getMethod() {
        return method;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
