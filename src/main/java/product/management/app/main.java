package product.management.app;

import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //define variables for the entity(product)
        //first product
//        String name1 = "Asus Vivobook";
//        String type1 = "laptop";
//        String place1 = "Brown Table";
//        int warranty1 = 2026;
        ProductService service = new ProductService();


        service.addProduct(new Product("Asus","Laptop","Brown Table",2026));
        service.addProduct(new Product("Dell","Laptop","Black Table",2002));
        service.addProduct(new Product("Lenovo","Tablet","White Table",2022));
        service.addProduct(new Product("Apple","iPhone","shelf",2028));
        service.addProduct(new Product("Macbook pro","Laptop","Brown Table",2026));


       List<Product> products= service.getAllProducts();
        //use enhaced for loop to print products one at a time
        for (Product p : products){
            System.out.println(p);
        }
        System.out.println("=============================================");
        System.out.println("getting particular product");
        Product p = service.getProduct("shelf");
        System.out.println(p);

        //searching particular text
        System.out.println("=============================================");
        System.out.println("getting particular text: ");
        List<Product> prods= service.getProductText("brown");
        for (Product product:prods){
            System.out.println(product);
        }


    }
}
