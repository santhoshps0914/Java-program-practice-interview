package threadsschool.synchronization;

public class MethodSynchronization {

    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        Thread t1 = new Thread(()->{

            for (int i = 0; i < 1000; i++) {
                counter.doIncrement();
            }
        });

        Thread t2 = new Thread(()->{

            for (int i = 0; i < 1000; i++) {
                counter.doIncrement();
            }
        });
        
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("counter : "+counter.getCounter());
        
        
    }
    
    
}

class Counter {
    
    private int count = 0;
    
    public synchronized void doIncrement(){
        
        count++;
        
    }
    
    public synchronized int getCounter(){
        return count;
    }
    
    
}
