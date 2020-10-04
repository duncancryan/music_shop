package families;

public abstract class Brass extends Instrument{
    private boolean hasValves;
    public Brass(String material, String colour, double buyingPrice, double sellingPrice, boolean hasValves) {
        super(material, colour, buyingPrice, sellingPrice);
        this.hasValves = hasValves;
    }

    public boolean checkValves() {
        return hasValves;
    }
}
