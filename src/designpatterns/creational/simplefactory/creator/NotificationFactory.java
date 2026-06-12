package designpatterns.creational.simplefactory.creator;

import designpatterns.creational.simplefactory.product.Notification;
import designpatterns.creational.simplefactory.product.concrete.EmailNotification;
import designpatterns.creational.simplefactory.product.concrete.PushNotification;
import designpatterns.creational.simplefactory.product.concrete.SMSNotification;

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
