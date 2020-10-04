package families;

import enums.StringMethod;

public abstract class Strings extends Instrument{

    private int numberOfStrings;
    private StringMethod stringMethod;
    private boolean isElectric;

    public Strings(String material, String colour, double buyingPrice, double sellingPrice, int numberOfStrings, StringMethod stringMethod, boolean isElectric) {
        super(material, colour, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
        this.stringMethod = stringMethod;
        this.isElectric = isElectric;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public StringMethod getMethod() {
        return stringMethod;
    }

    public String getMethodString(){
        return stringMethod.getMethod();
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

}
