package list.shoppingCart;

import list.shoppingCart.cart.Cart;
import list.shoppingCart.cart.Product;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addProduct(new Product("Dell i7 Laptop", 1200, 1));
        cart.addProduct(new Product("Philips TV 4K 60-inch", 560, 1));
        cart.addProduct(new Product("Philips TV 4K 60-inch", 560, 1));
        cart.removeProduct("Philips TV 4K 60-inch");
        cart.listProducts();
        System.out.println(cart.getTotalPrice());

    }
}
