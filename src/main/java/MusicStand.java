public class MusicStand extends StockItem {

    private String colour;

    public MusicStand(String colour, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.colour = colour;
    }

    public String getColor() {
        return this.colour;
    }

    public int getMarkupPrice() {
        return this.sellPrice -= this.buyPrice;
    }

}
