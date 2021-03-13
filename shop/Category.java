package shop;

public class Category {
    String name;
    Product[] products;

    public Category(String name, int numberOfProducts) {
        this.name = name;
        products = new Product[numberOfProducts];
    }
}