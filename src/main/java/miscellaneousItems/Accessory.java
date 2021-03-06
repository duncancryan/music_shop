package miscellaneousItems;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Accessory(String description, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public double calculateMarkUp(){
        return this.sellingPrice - this.buyingPrice;
    }

    public int calculateMarkUpPercentage(){
        double percentage = (this.calculateMarkUp() / this.buyingPrice) * 100;
        return (int)Math.rint(percentage);
    }
}
