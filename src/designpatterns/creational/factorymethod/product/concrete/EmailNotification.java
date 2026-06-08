package designpatterns.creational.factorymethod.product.concrete;

import designpatterns.creational.factorymethod.product.Notification;

public class EmailNotification implements Notification {
    
    @Override
    public void notifyUser(String message) {
        System.out.println("Email Sent with message: "+message);
    }
    
}
