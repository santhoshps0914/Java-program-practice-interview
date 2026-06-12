package designpatterns.creational.simplefactory.product.concrete;

import designpatterns.creational.simplefactory.product.Notification;

public class SMSNotification implements Notification {
    
    
    @Override
    public void notifyUser(String message) {
        System.out.println("SMS sent with message: "+message);
    }
    
    
}
