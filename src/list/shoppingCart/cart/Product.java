package list.shoppingCart.cart;

public class Product {
    private final String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getTotalPrice(){
        return this.getPrice() * this.getAmount();
    }

    @Override
    public String toString() {
        return "{name: '" + name + '\'' +
                ", price: " + price +
                ", amount: " + amount +
                "}\n";
    }
}
