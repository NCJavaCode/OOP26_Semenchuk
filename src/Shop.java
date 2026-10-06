public class Shop implements Nameable, Printable {

    private String className;
    private String name;

    public Shop(String name) {
        this.className = "Shop";
        this.name = name;
    }

    @Override
    public String getName() {
        return className;
    }

    @Override
    public void printInfo() {
        System.out.println("Магазин: " + name);
    }
}