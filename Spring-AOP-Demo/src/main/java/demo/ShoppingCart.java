package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String text){
        //logging
        //auth
        //sanitize
        System.out.println("CHECKOUT method for cart");
    }

    public int calTotal(){
        return 101;
    }
}





//we will go Annotation base configuration with bean config fileddm