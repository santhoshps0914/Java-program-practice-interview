package designpatterns.creational.factorymethod.concreteproduct;

import designpatterns.creational.factorymethod.product.INotification;

public class PushNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Push notification sent");
    }
}
