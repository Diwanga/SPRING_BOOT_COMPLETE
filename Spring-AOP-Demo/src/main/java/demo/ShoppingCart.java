package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(){
        System.out.println("CHECKOUT method for cart");
    }
}





//we will go Annotation base configuration with bean config fileddm