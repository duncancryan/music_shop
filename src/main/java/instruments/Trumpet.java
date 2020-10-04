package instruments;

import families.Brass;

public class Trumpet extends Brass {
    public Trumpet(String material, String colour, double buyingPrice, double sellingPrice, boolean hasValves) {
        super("Brass", "Copper", buyingPrice, sellingPrice, true);
    }

    public String play() {
        return "Paaaarrrp! Fraaaapp!";
    }
}
