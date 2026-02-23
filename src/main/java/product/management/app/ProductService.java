package product.management.app;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    //list to store our products
    List<Product> products = new ArrayList<>();


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
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name) || p.getName().equals(name)) {
                return p;
            }

        }
        return null;
    }

}

