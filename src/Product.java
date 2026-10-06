public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Товар: " + name);
        System.out.println("Ціна: " + price + " грн");
    }

    public void buy() {
        System.out.println("Товар " + name + " куплено.");
    }

    public void buy(int quantity) {
        System.out.println("Куплено товарів: " + quantity);
    }
}