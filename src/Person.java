public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
    }

    public abstract void work();
}