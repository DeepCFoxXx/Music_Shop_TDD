public class MusicStand implements ISell {

    private String colour;
    private int buyPrice;
    private int sellPrice;

    public MusicStand(String colour, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColor() {
        return this.colour;
    }
}
