public class Guitar extends Instrument {

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


}
