import app.shop.Apple;
import app.shop.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Product!");

        Product product = new Product("Ass", 45);

        System.out.println(product.getClass());
        System.out.println(
                "name - " + product.getName() + ", " +
                "price - " + product.getPrice()
        );

        Apple apple = new Apple("iPhone", 1000, "X");
        System.out.println(apple.getClass());
        System.out.println(
                "name - " + apple.getName() + ", " +
                "price - " + apple.getPrice() + ", " +
                "model - " + apple.getModel()
        );
    }
}
