public class Customer extends Person {

    public Customer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Покупець обирає товари для творчості.");
    }
}