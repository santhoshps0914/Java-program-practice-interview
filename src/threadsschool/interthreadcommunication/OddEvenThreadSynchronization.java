package threadsschool.interthreadcommunication;

public class OddEvenThreadSynchronization {
    
    volatile static int counter = 1;
    
    
    int limit;
    
    
    OddEvenThreadSynchronization(int limit){
        this.limit=limit;
    }
    
    public synchronized void printOddNumber(){
        
        while (counter<=limit){
            if (counter%2!=0){
                System.out.println(Thread.currentThread().getName()+" : "+counter);
                counter++;
                notify();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void printEvenNumber(){
        while (counter<=limit){

            if (counter%2==0){
                System.out.println(Thread.currentThread().getName()+" : "+counter);
                counter++;
                notify();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            
        }
    }


    public static void main(String[] args) {
        
        OddEvenThreadSynchronization oddeven = new OddEvenThreadSynchronization(20);
        
        Thread oddThread = new Thread(()->{
            oddeven.printOddNumber();
        },"ODD-THREAD");

        Thread evenThread = new Thread(()->{
            oddeven.printEvenNumber();
        },"EVEN-THREAD");
        
        oddThread.start();
        evenThread.start();
        
        
    }
    
    
    
}
