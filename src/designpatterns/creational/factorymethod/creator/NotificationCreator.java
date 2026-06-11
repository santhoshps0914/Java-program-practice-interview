package designpatterns.creational.factorymethod.creator;

import designpatterns.creational.factorymethod.product.INotification;

public abstract class NotificationCreator {
    
    public abstract INotification createNotification();
    
    public void notifyUser(){
        INotification notification = createNotification();
        notification.send();
    }
    
}
