public class Guitar extends Instrument implements IPlay, ISell {

    private String model;
    private int numberOfStrings;
    private int costPrice;
    private int retailPrice;

    public Guitar(String model, String colour, int numberOfStrings, int costPrice, int retailPrice) {
        super(colour, "String");
        this.numberOfStrings = numberOfStrings;
        this.model = model;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }


    public String getModel() {
        return this.model;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public int getCostPrice() {
        return this.costPrice;
    }

    public int getRetailPrice() {
        return this.retailPrice;
    }

    public int getMarkupPrice() {
        return this.retailPrice -= this.costPrice;
    }

    public String play() {
        return "Start me up";
    }
}
