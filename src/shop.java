public class shop {
    String name;
    int products;

    shop(String name, int products) {
        this.name = name;
        this.products = products;
    }

    void showInfo() {
        System.out.println("Магазин: " + name);
        System.out.println("Кількість товарів: " + products);
    }

    void addProduct() {
        products++;
        System.out.println("Товар додано.");
    }
}