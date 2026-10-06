public class product {
    private String name;
    private double price;

    public product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Ціна повинна бути більше 0!");
        }
    }

    public void showInfo() {
        System.out.println("Товар: " + name);
        System.out.println("Ціна: " + price + " грн");
    }
}

