package product.management.app;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    //list to store our products
    List<Product> products = new ArrayList<>();
    String place;
    String name;
    String type;
    int warranty;




    //service layer
    //ProductService service= new ProductService();

    //objects of product
//    Product p = new Product("Asus","Laptop","Brown Table",2026);
//    //use service to add the products

    public void addProduct(Product p) {
        products.add(p);


    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        //searching through the products list for a specific product
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name) || p.getName().equals(name)) {
                return p;
            } else if (p.getPlace().equalsIgnoreCase(place) || p.getPlace().equals(place)){
                return p;

            }



        }
        return null;
    }

    public List<Product> getProductText(String text) {
        String str=text.toLowerCase();
        List<Product> prods = new ArrayList<>();
        for (Product p: products){
            String name=p.getName().toLowerCase();
            String place=p.getPlace().toLowerCase();
            String type=p.getType().toLowerCase();
            if(name.contains(text) || place.contains(text) || type.contains(text)){
                prods.add(p);
            }
        }
        return prods;
    }
}

