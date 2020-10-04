package instruments;

import enums.StringMethod;
import families.Strings;

public class AcousticGuitar extends Strings {
    public AcousticGuitar(String material, String colour, double buyingPrice, double sellingPrice, int numberOfStrings, StringMethod method, boolean isElectric) {
        super("Wood", "Brown", buyingPrice, sellingPrice, 6, StringMethod.STRUM, false);
    }

    public String play() {
        return "Struuuuumm, Struum Strum!";
    }
}
