public class Seller extends Person {

    public Seller(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Продавець продає товари для творчості.");
    }
}