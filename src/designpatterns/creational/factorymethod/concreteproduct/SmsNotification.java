package designpatterns.creational.factorymethod.concreteproduct;

import designpatterns.creational.factorymethod.product.INotification;

public class SmsNotification implements INotification {
    @Override
    public void send() {
        System.out.println("SMS notification sent");
    }
}
