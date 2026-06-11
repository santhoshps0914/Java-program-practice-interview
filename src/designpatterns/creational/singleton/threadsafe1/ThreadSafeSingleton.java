package designpatterns.creational.singleton.threadsafe1;

public class ThreadSafeSingleton {
    
    private static ThreadSafeSingleton singleton;
    
    private ThreadSafeSingleton(){
        
    }
    
    public static synchronized ThreadSafeSingleton getInstance(){
        
        if (singleton==null)
            singleton = new ThreadSafeSingleton();
        
        return singleton;
        
    }
}
