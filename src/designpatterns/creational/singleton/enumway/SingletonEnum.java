package designpatterns.creational.singleton.enumway;

public enum SingletonEnum {
    
    INSTANCE;
    
    
    public void getInstance(){
        System.out.println("Enum way pf initializing");
    }
    
    
}
