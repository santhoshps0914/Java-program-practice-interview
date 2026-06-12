package designpatterns.creational.simplefactory.product.concrete;

import designpatterns.creational.simplefactory.product.Notification;

public class EmailNotification implements Notification {
    
    @Override
    public void notifyUser(String message) {
        System.out.println("Email Sent with message: "+message);
    }
    
}
