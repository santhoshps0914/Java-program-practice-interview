package designpatterns.structural.adapter.adaptee;

public class OldPaymentGateway {
    
    public void makePayment(double amount){
        System.out.println("payment done through old gateway with amount: "+amount);
    }
    
}
