package designpatterns.creational.singleton.innerclasslazy;

public class Singleton {
    
    private Singleton(){
        System.out.println("Singleton initialized");
    }
    
    private static class SingletonInner{
        private static final Singleton INSTANCE = new Singleton();
    }
    
    public static Singleton getInstance(){
        return SingletonInner.INSTANCE;
    }
    
}
