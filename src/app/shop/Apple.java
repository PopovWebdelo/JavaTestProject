package app.shop;

public class Apple extends Product {
    private String model;

    public Apple(String name, int price, String model) {
        super(name, price);
        this.model = model;
    }

    /**
     * Retrieve model
     *
     * @return
     */
    public String getModel() {
        return getName() + ":" + model;
    }

    /**
     * Set model to product
     *
     * @param model Model data
     */
    public void setModel(String model) {
        this.model = model;
    }


}
