package threadsschool.basics.extendthread;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {
        
        MyThread thread = new MyThread();
        
        thread.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread "+i);
        }
        
    }
    
}
