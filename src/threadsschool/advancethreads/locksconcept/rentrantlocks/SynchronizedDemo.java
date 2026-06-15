package threadsschool.advancethreads.locksconcept.rentrantlocks;

public class SynchronizedDemo {

    public static void main(String[] args) {
        
        Display display = new Display();
        MyThread mt1 = new MyThread(display,"Kohli");
        MyThread mt2 = new MyThread(display,"Rapa");
        
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        
        t1.start();
        t2.start();
        
    }
    
}

class Display{
    
    
    public synchronized void wish(String message){

        for (int i = 0; i < 10; i++) {

            System.out.print("Good Morning : ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

            System.out.println(message);

        }
    }
    
}

class MyThread implements Runnable{

    private Display display;
    private String name;

    public MyThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}