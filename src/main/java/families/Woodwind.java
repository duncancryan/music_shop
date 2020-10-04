package families;

import enums.ReedCount;

public abstract class Woodwind extends Instrument{

    private ReedCount reedCount;

    public Woodwind(String material, String colour, double buyingPrice, double sellingPrice, ReedCount reedCount) {
        super(material, colour, buyingPrice, sellingPrice);
        this.reedCount = reedCount;
    }
}
