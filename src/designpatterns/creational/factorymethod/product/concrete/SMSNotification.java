package designpatterns.creational.factorymethod.product.concrete;

import designpatterns.creational.factorymethod.product.Notification;

public class SMSNotification implements Notification {
    
    
    @Override
    public void notifyUser(String message) {
        System.out.println("SMS sent with message: "+message);
    }
    
    
}
