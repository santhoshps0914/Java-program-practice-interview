package designpatterns.creational.factorymethod.creator;

import designpatterns.creational.factorymethod.product.Notification;
import designpatterns.creational.factorymethod.product.concrete.EmailNotification;
import designpatterns.creational.factorymethod.product.concrete.PushNotification;
import designpatterns.creational.factorymethod.product.concrete.SMSNotification;

public class NotificationFactory {
    
    public Notification createNotification(String type){

        return switch (type.toLowerCase()) {
            case "push" -> new PushNotification();
            case "sms" -> new SMSNotification();
            case "email", "e-mail" -> new EmailNotification();
            default -> throw new RuntimeException("Unknown Notification");
        };
        
    }
    
    
}
