package designpatterns.creational.factorymethod.concreteproduct;

import designpatterns.creational.factorymethod.product.INotification;

public class EmailNotification implements INotification {

    @Override
    public void send() {
        System.out.println("Email Sent");
    }
}
