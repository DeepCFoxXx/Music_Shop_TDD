public class MusicBook extends StockItem {

    String title;
    int buyPrice;
    int sellPrice;

    public MusicBook(String title, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    
}
