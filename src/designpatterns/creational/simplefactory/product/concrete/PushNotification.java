package designpatterns.creational.simplefactory.product.concrete;

import designpatterns.creational.simplefactory.product.Notification;

public class PushNotification implements Notification {
    
    @Override
    public void notifyUser(String message) {

        System.out.println("Push notification sent: "+message);
        
    }
    
    
}
