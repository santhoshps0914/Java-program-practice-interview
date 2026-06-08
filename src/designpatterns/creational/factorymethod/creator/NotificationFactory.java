package designpatterns.creational.factorymethod.creator;

import designpatterns.creational.factorymethod.product.Notification;
import designpatterns.creational.factorymethod.product.concrete.EmailNotification;
import designpatterns.creational.factorymethod.product.concrete.PushNotification;
import designpatterns.creational.factorymethod.product.concrete.SMSNotification;

public class NotificationFactory {
    
    public Notification createNotification(String type){
        
        switch (type.toLowerCase()){
            case "push" :
                return new PushNotification();
            case "sms" :
                return new SMSNotification();
            case "email","e-mail":
                return new EmailNotification();
            default:
                throw new RuntimeException("Unknown Notification");
        }
        
    }
    
    
}
