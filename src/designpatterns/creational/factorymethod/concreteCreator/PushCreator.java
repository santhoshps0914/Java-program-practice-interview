package designpatterns.creational.factorymethod.concreteCreator;

import designpatterns.creational.factorymethod.concreteproduct.PushNotification;
import designpatterns.creational.factorymethod.creator.NotificationCreator;
import designpatterns.creational.factorymethod.product.INotification;

public class PushCreator extends NotificationCreator {
    @Override
    public INotification createNotification() {
        return new PushNotification();
    }
}
