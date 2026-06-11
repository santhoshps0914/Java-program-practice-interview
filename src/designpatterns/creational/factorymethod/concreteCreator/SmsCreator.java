package designpatterns.creational.factorymethod.concreteCreator;

import designpatterns.creational.factorymethod.concreteproduct.SmsNotification;
import designpatterns.creational.factorymethod.creator.NotificationCreator;
import designpatterns.creational.factorymethod.product.INotification;

public class SmsCreator extends NotificationCreator {
    @Override
    public INotification createNotification() {
        return new SmsNotification();
    }
}
