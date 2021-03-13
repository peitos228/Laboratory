package shop;

public class User {
    String login;
    String password;
    Basket myBasket = new Basket(1);

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login) {
        this.login = login;
        this.password = "login";
    }
}