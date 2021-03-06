public class MusicBook extends StockItem {

    String title;

    public MusicBook(String title, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getMarkupPrice() {
        return this.sellPrice -= this.buyPrice;
    }

}
