package threadsschool.advancethreads.locksconcept.rentrantlocks;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockReentrantDemo extends Thread {
    
    static ReentrantLock reentrantLock = new ReentrantLock();

    public TryLockReentrantDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        
        if (reentrantLock.tryLock()){

            System.out.println(Thread.currentThread().getName()+" performing safe operation");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
            reentrantLock.unlock();
        }else{
            System.out.println(Thread.currentThread().getName()+" performing unsafe operation");
        }
        
    }


    public static void main(String[] args) {

        TryLockReentrantDemo t1 = new TryLockReentrantDemo("VIRAT");
        TryLockReentrantDemo t2 = new TryLockReentrantDemo("ABD");
        TryLockReentrantDemo t3 = new TryLockReentrantDemo("GAYLE");
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}


