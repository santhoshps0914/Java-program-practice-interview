package threadsschool.advancethreads.executorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorFrameworkDemo {

    public static void main(String[] args) {

        PrintJobs[] jobs = {
          new PrintJobs("SALT"), new PrintJobs("DDP"),
          new PrintJobs("VIRAT"), new PrintJobs("RAPA"),
          new PrintJobs("VIyer"), new PrintJobs("TimmyD")
        };
        
        ExecutorService service = Executors.newFixedThreadPool(3);
        
        for (PrintJobs job : jobs){
            service.submit(job);
        }
        
        service.shutdown();
        
    }
    
    
}

class PrintJobs implements Runnable{
    
    String name;
    
    public PrintJobs(String name){
        this.name=name;
    }

    @Override
    public void run() {

        System.out.println(name+" ... Job started by Thread : "+Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println(name+" ... Job completed by Thread : "+Thread.currentThread().getName());
        

    }
}
