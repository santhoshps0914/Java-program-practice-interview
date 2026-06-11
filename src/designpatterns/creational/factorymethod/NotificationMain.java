package designpatterns.creational.factorymethod;

import designpatterns.creational.factorymethod.concreteCreator.EmailCreator;
import designpatterns.creational.factorymethod.concreteCreator.PushCreator;
import designpatterns.creational.factorymethod.concreteCreator.SmsCreator;
import designpatterns.creational.factorymethod.creator.NotificationCreator;

public class NotificationMain {
    public static void main(String[] args) {
        
        NotificationCreator creator = new PushCreator();
        creator.notifyUser();
        
        creator = new SmsCreator();
        creator.notifyUser();
        
        creator = new EmailCreator();
        creator.notifyUser();
        
        
    }
}
