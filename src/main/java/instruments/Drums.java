package instruments;

import enums.PercussionMethod;
import families.Percussion;
import families.Strings;

public class Drums extends Percussion {
    public Drums(String material, String colour, double buyingPrice, double sellingPrice, PercussionMethod method) {
        super("Plastic", colour, buyingPrice, sellingPrice, PercussionMethod.STRIKE);
    }

    public String play() {
        return "Boom Bap!";
    }
}
