package org.example.springprjct;

import org.example.springprjct.entities.Product;
import org.example.springprjct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringPrjctApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringPrjctApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //productRepository.save(new Product(null,"zara",123.4,45));
        //productRepository.save(new Product(null,"NIKE",500,10));
        //productRepository.save(new Product(null,"Clavier",100.4,100));
        Product products = productRepository.findById(Long.valueOf(1)).get();

        System.out.println("******************");
        System.out.println(products.getId());
        System.out.println(products.getName());
        System.out.println(products.getQuantity());
        System.out.println("******************************");

        //productRepository.deleteById(Long.valueOf(2));
        List<Product> product2 = productRepository.findByPriceGreaterThan(234);
        product2.forEach(product -> System.out.println(product));

        List<Product> product3 = productRepository.findByNameContains("a");
        product3.forEach(product -> System.out.println(product));



    }


}
