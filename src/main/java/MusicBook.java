public class MusicBook implements ISell {

    String title;
    int buyPrice;
    int sellPrice;

    public MusicBook(String title, int buyPrice, int sellPrice) {
        this.title = title;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getTitle() {
        return this.title;
    }
}