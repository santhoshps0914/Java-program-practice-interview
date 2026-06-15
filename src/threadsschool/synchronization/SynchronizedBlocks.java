package threadsschool.synchronization;

class Counter02 {
    
    private int counter;
    
    public void increment(){
        synchronized (this){
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }
}

public class SynchronizedBlocks{

    public static void main(String[] args) throws InterruptedException {
        
        Counter02 counter02 = new Counter02();
        
        Thread myThread1 = new Thread(()->{

            for (int i = 0; i < 1000; i++) {
                counter02.increment();
            }
        });

        Thread myThread2 = new Thread(()->{

            for (int i = 0; i < 1000; i++) {
                counter02.increment();
            }
        });
        
        myThread1.start();
        myThread2.start();
        
        myThread1.join();
        myThread2.join();

        System.out.println("Counter: "+counter02.getCounter());




    }
    
    
}
