package designpatterns.creational.factorymethod.concreteCreator;

import designpatterns.creational.factorymethod.concreteproduct.EmailNotification;
import designpatterns.creational.factorymethod.creator.NotificationCreator;
import designpatterns.creational.factorymethod.product.INotification;

public class EmailCreator extends NotificationCreator {
    @Override
    public INotification createNotification() {
        return new EmailNotification();
    }
}
