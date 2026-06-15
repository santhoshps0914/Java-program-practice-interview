package threadsschool.advancethreads.locksconcept.rentrantlocks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocksDemoDisplay {


    public static void main(String[] args) {

        DisplayReentrant displayReentrant = new DisplayReentrant();

        ReentrantThreadDemo rt1 = new ReentrantThreadDemo(displayReentrant,"Krunal");
        ReentrantThreadDemo rt2 = new ReentrantThreadDemo(displayReentrant,"Bhuvi");
        
        rt1.start();
        rt2.start();
        
        
    }
    
}

class DisplayReentrant{
    
    ReentrantLock reentrantLock = new ReentrantLock();
    
    public void message(String name) throws InterruptedException {
        
        reentrantLock.lock();

        for (int i = 0; i < 10; i++) {
            System.out.print("Good Night  : ");
            Thread.sleep(1000);
            System.out.println(name);
        }
        reentrantLock.unlock();
    }
    
}

class ReentrantThreadDemo extends Thread {
    
    DisplayReentrant displayReentrant;
    String name;

    public ReentrantThreadDemo(DisplayReentrant displayReentrant, String name){
        this.displayReentrant=displayReentrant;
        this.name=name;
    }
    
    @Override
    public void run() {
        try {
            displayReentrant.message(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
