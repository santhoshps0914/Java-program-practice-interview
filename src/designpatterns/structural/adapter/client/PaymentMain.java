package designpatterns.structural.adapter.client;

import designpatterns.structural.adapter.adaptee.OldPaymentGateway;
import designpatterns.structural.adapter.adapter.PaymentAdapter;
import designpatterns.structural.adapter.target.IPaymentProcessor;

public class PaymentMain {

    public static void main(String[] args) {

        OldPaymentGateway oldPaymentGateway = new OldPaymentGateway();
        //traditional approach
        //   oldPaymentGateway.makePayment(32340.23);


        IPaymentProcessor paytm = new PaymentAdapter(oldPaymentGateway);
        
        paytm.pay(34250.34);
        
    }
    
    
}
