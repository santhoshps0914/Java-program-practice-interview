package designpatterns.creational.builder;

import designpatterns.creational.builder.product.User;
import designpatterns.creational.builder.traditional.UserTraditional;

public class BuilderMain {

    public static void main(String[] args) {

        UserTraditional user1 = new UserTraditional("Santhosh",
                "kumar",24,"santhosh@gmail.com","Hyderabad");
        
        System.out.println(user1);
        
        /*
        *  this is an user object without builder pattern look 
        * if you dont want to fill all details still you need fill constructor
        *  to avoid this we are replacing with Builder pattern
        * 
        * */

        User user = new User.Builder()
                .setFirstName("raghava")
                .setLastName("Lawrence")
                .setAddress("chennai")
                .build();

        System.out.println(user);
        
        
    }
    
    
}
