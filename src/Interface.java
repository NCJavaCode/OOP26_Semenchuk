public class Interface {

    public static void main(String[] args) {

        Product product = new Product("Фарби", 150);
        Shop shop = new Shop("Творчість");

        System.out.println(product.getName());
        product.printInfo();

        System.out.println();

        System.out.println(shop.getName());
        shop.printInfo();
    }
}