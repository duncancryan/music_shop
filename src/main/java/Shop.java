import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addToStock(ISell stockItem){
        this.stock.add(stockItem);
    }

//    have made the below return the removed item in consideration
//    of what you might want to do with this program in the future

    public ISell removeFromStock(ISell soldItem){
        return this.stock.remove(this.stock.indexOf(soldItem));
    }

    public double getTotalPotentialProfit() {
        return this.stock.stream()
                .map(stockItem -> stockItem.calculateMarkUp())
                .reduce(0.00, (sum, markUp) -> sum += markUp);
    }
}
