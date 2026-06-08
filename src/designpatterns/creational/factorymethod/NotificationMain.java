package designpatterns.creational.factorymethod;

import designpatterns.creational.factorymethod.creator.NotificationFactory;

public class NotificationMain {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        
        var notification = notificationFactory.createNotification("SmS");
        var notification2 = notificationFactory.createNotification("e-MaIl");
        var notification3 = notificationFactory.createNotification("PUSH");
        
        notification.notifyUser("Balance amt credited");

        notification2.notifyUser("your inbox is 90% full");

        notification3.notifyUser("malle bartide yummy biryani beka");
        
        
    }
    
}
