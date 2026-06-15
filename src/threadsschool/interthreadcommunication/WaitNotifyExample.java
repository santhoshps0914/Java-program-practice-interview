package threadsschool.interthreadcommunication;

public class WaitNotifyExample {
    static int arrayLength;
    public static void main(String[] args) {
        Message Msg = new Message();

        Thread sender = new Thread(()->{

            String[] messages = {"Hi","Hellow","Welcome","How's your day going","Good bye"};
            arrayLength = messages.length;
            for (String message : messages){
                Msg.sendMessage(message);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"SENDER");

        Thread receiver = new Thread(()->{

            try {
                for (int i = 0; i < arrayLength; i++) {
                    Msg.receiveMessage();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"RECEIVER");

        sender.start();
        receiver.start();


    }
    
    
    
    
}

class Message{ 
    
    private String message;
    private boolean hasMessage;
    
    public synchronized void sendMessage(String message){
        
        while (hasMessage){  //If message is already sent then wait
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        
        this.message=message;
        hasMessage=true;

        System.out.println("Message sent : "+message);
        notify(); //notify the receiver thread
    }
    
    public synchronized void receiveMessage(){
        
        while (!hasMessage){ //if no message then wait
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Message Rec4eived : "+message);
        hasMessage = false;
        notify(); //notify sender thread
    }
    
    
}
