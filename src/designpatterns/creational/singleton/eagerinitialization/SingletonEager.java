package designpatterns.creational.singleton.eagerinitialization;

public class SingletonEager {
    
    private static SingletonEager eager = new SingletonEager();
    
    private SingletonEager(){
        
    }
    
    public static SingletonEager getInstance(){
        return eager;
    }
    
    
}
