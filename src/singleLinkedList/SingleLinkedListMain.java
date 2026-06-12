package singleLinkedList;

public class SingleLinkedListMain {

    public static void main(String[] args) {
        
        SingleLinkedList list = new SingleLinkedList(10);
        
        
        

        list.insertionAtEnd(20);
        list.insertionAtEnd(30);
        list.insertionAtEnd(40);
        list.insertionAtEnd(50);
        list.insertionAtEnd(60);

        list.printList();
        
        list.insertionAtFirst(5);

        list.printList();

        System.out.println("index: "+list.getIndexByValue(30));
        
        list.insertAtPosition(3,25);
        
        list.printList();
        
        list.removalFromValue(30);
        
        list.printList();

        System.out.println("Length: "+list.getLength());
        
    }
    
}
