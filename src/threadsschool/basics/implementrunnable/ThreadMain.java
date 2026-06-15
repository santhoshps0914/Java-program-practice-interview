package threadsschool.basics.implementrunnable;

public class ThreadMain {

    public static void main(String[] args) {
        
        MyRunnable runnableThread = new MyRunnable();
        
        Thread thread = new Thread(runnableThread);
        
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        
        
    }
    
    
}
