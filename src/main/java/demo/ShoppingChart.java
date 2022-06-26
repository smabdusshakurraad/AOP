package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingChart {

    // All the aspects
    //Logging
    // Authentication and Authorization
    // Sanitizing the data
    public void shoppingChart(String str){
        System.out.println("From shopping Chart");
    }

    public  int quantity(){
        return 2;
    }
}
