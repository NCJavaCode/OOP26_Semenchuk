public class customer {
    String name;
    int age;

    customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Покупець: " + name);
        System.out.println("Вік: " + age);
    }
}