public class product {
    String name;
    double price;

    product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showInfo() {
        System.out.println("Товар: " + name);
        System.out.println("Ціна: " + price + " грн");
    }
}
