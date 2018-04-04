public class Piano extends Instrument implements IPlay, ISell {

    private String manufacturer;
    private int buyPrice;
    private int sellPrice;

    public Piano(String manufacturer, String colour, int buyPrice, int sellPrice) {
        super(colour, "Keyboard");
        this.manufacturer = manufacturer;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String play() {
        return "I don't like mondays";
    }


}
