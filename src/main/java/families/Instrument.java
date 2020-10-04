package families;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String material;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String material, String colour, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int calculateMarkUp(){
        double markUp = this.sellingPrice - this.buyingPrice;
        double result = (markUp / this.buyingPrice) * 100;
        return (int)Math.rint(result);
    }


}
