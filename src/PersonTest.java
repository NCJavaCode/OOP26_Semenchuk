public class PersonTest {
    public static void main(String[] args) {

        Person customer = new Customer("Олена", 20);
        Person seller = new Seller("Іван", 30);

        customer.work();
        seller.work();
    }
}