public class PersonFactory {

    public Person createPerson(String type, String name, int age) {

        if (type.equalsIgnoreCase("customer")) {
            return new Customer(name, age);
        } else if (type.equalsIgnoreCase("seller")) {
            return new Seller(name, age);
        }

        return null;
    }
}
