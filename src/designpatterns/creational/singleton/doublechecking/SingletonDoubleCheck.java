package designpatterns.creational.singleton.doublechecking;

public class SingletonDoubleCheck {
    
    private static volatile SingletonDoubleCheck singleton;
    
    private SingletonDoubleCheck(){
        
    }

    public static synchronized SingletonDoubleCheck getInstance() {
        
        if (singleton==null){
            
            synchronized (SingletonDoubleCheck.class){
                
                if (singleton==null){
                    singleton = new SingletonDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
