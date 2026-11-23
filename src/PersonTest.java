public class PersonTest {

    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();

        Person customer = personFactory.createPerson("customer", "Олена", 20);
        Person seller = personFactory.createPerson("seller", "Іван", 30);

        customer.work();
        seller.work();
    }
}