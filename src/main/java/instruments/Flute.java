package instruments;

import enums.ReedCount;
import families.Strings;
import families.Woodwind;

public class Flute extends Woodwind {
    public Flute(String material, String colour, double buyingPrice, double sellingPrice, ReedCount reedCount) {
        super(material, "Silver", buyingPrice, sellingPrice, ReedCount.NONE);
    }

    public String play() {
        return null;
    }
}
