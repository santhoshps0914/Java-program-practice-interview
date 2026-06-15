package threadsschool.synchronization;

public class StaticSynchronizationDemo {


    public static void main(String[] args) {
        
        
        
        Thread t1 = new Thread(()->{
            Table.printTable(1);
        });

        Thread t2 = new Thread(()->{
            Table.printTable(5);
        });

        Thread t3 = new Thread(()->{
            Table.printTable(8);
        });
        
        t1.start();
        t2.start();
        t3.start();
        
        
        
    }
    
}


class Table{
    
    synchronized static void printTable(int n){

        System.out.println("n value is : "+n);
        
        for (int i = 0; i <=3; i++) {
            System.out.println(n*i);
        }
    }
    
}
