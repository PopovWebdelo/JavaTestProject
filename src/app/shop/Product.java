package app.shop;

public class Product {
    /**
     * Product name
     */
    private String name;

    /**
     * Product price
     */
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set name for product
     *
     * @param name New product name
     * @return
     */
    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
