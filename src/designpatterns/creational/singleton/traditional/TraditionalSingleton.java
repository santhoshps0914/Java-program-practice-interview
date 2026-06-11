package designpatterns.creational.singleton.traditional;

public class TraditionalSingleton {
    
    private static TraditionalSingleton singleton;
    
    
    private TraditionalSingleton(){
        
    }
    
    
    public static TraditionalSingleton getInstance(){
        if (singleton==null)
            singleton = new TraditionalSingleton();
        
        return singleton;
    }
    
}
