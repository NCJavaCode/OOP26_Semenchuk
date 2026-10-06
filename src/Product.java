public class Product implements Nameable, Printable {

    private String className;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.className = "Product";
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return className;
    }

    @Override
    public void printInfo() {
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