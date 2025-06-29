package OOPS2.Abstraction2;

public class OnlineStore {
    public static void main(String[] args) {
        Product electronic = new Electronics("Smartphone", 500);
        Product clothing = new Clothing("Dress", 50);

        System.out.println(electronic.calculateTax());
        System.out.println(clothing.calculateShippingCost());
    }
}
