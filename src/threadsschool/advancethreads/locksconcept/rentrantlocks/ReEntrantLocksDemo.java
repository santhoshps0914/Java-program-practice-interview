package threadsschool.advancethreads.locksconcept.rentrantlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLocksDemo {

    public static void main(String[] args) {

        ReentrantLock lockxx = new ReentrantLock(); //creates a lock with fairness policy false
        
        //Lock lock = new ReentrantLock(true); //creates a lock with fairness policy true


        lockxx.lock();
        lockxx.lock();

        System.out.println("is locked: "+lockxx.isLocked());
        System.out.println("is held by curr thread : "+lockxx.isHeldByCurrentThread());
        System.out.println("Queue length : "+lockxx.getQueueLength());
        System.out.println("Hold count is : "+lockxx.getHoldCount());
        
        lockxx.unlock();

        System.out.println("after unlocking once");

        System.out.println("is locked: "+lockxx.isLocked());
        System.out.println("is held by curr thread : "+lockxx.isHeldByCurrentThread());
        System.out.println("Queue length : "+lockxx.getQueueLength());
        System.out.println("Hold count is : "+lockxx.getHoldCount());
        
        
        lockxx.unlock();

        System.out.println("after unlocking twice");

        System.out.println("is locked: "+lockxx.isLocked());
        System.out.println("is held by curr thread : "+lockxx.isHeldByCurrentThread());
        System.out.println("Queue length : "+lockxx.getQueueLength());
        System.out.println("Hold count is : "+lockxx.getHoldCount());
        
        
        
        
        
        
        
    }
    
    
}
