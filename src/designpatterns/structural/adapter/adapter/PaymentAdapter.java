package designpatterns.structural.adapter.adapter;

import designpatterns.structural.adapter.adaptee.OldPaymentGateway;
import designpatterns.structural.adapter.target.IPaymentProcessor;

public class PaymentAdapter implements IPaymentProcessor {
    
    private final OldPaymentGateway gateway;

    public PaymentAdapter(OldPaymentGateway gateway) {
        this.gateway = gateway;
    }
    
    @Override
    public void pay(double amt) {
        System.out.println("passing through adapter");
        gateway.makePayment(amt);
        
    }
}
