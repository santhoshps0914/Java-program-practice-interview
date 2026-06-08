package designpatterns.creational.factorymethod.product.concrete;

import designpatterns.creational.factorymethod.product.Notification;

public class PushNotification implements Notification {
    
    @Override
    public void notifyUser(String message) {

        System.out.println("Push notification sent: "+message);
        
    }
    
    
}
