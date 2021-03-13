package shop;

public class Main {
    public static void main(String[] args) {
        Category weapon = new Category("Weapon", 3);
        Category armor = new Category("Armor", 4);
        User user1 = new User("Andrey", "12345678");
        Product sword = new Product("Sword", 10, 7.6f);
        System.out.print("Weapon: " + weapon + "\nArmor: " + armor + "\nUser: " + user1 + "\nProduct: " + sword);
    }
}