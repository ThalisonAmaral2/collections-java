package list.shoppingCart.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product productInput){
        if(products.isEmpty()){
            products.add(productInput);
        }else{
            boolean productFound = false;
            for(Product product : products){
                if(product.getName().equalsIgnoreCase(productInput.getName())){
                    //The new Product already exists in the cart
                    int newAmount = product.getAmount() + productInput.getAmount();
                    product.setAmount(newAmount);
                    productFound = true;
                    break;
                }
            }
            if(!productFound){
                products.add(productInput);
            }
        }

    }
    public double getTotalPrice(){
        double total = 0;
        for(Product product : products){
            total += product.getTotalPrice();
        }
        return total;
    }
    public void removeProduct(String name){
        List<Product> removeList = new ArrayList<>();
        for(Product product : products){
            if(product.getName().equalsIgnoreCase(name)){
                removeList.add(product);
            }
        }
        products.removeAll(removeList);
    }

    public void listProducts(){
        System.out.println(products);
    }

}
