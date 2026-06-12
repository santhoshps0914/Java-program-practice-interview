package singleLinkedList;

public class SingleLinkedList {
    
    private Node head;
    private Node tail;
    private int length;
    
    public SingleLinkedList(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(" -> "+temp.value);
            temp=temp.next;
        }
        System.out.println();
    }
    
    public void printHead(){
        System.out.println("Head value: "+head.value);
    }

    public void printTail(){
        System.out.println("Tail value: "+tail.value);
    }
    
    public int getLength(){
        return length;
    }
    
    public Node insertionAtFirst(int value){
        Node node = new Node(value);
        if (getLength()==0){
            tail=node;
        }else {
            node.next = head;
        }
        head = node;
        length++;
        return head;
    }
    
    public Node insertionAtEnd(int value){
        Node node = new Node(value);
        if (getLength()==0){
            head = node;
        }else{
            tail.next = node;
           
        }
        tail = node;
        length++;
        return tail;
    }
    
    public Node removalFromBeginning(){
        
        if (length==0) return null;
        
        Node temp = head;
        
        head = temp.next;
        temp.next = null;
        
        length--;
        
        if (length==0){
            head =null;
            tail = null;
        }
        return temp;
    }
    
    public Node removalFromEnd(){
        Node temp = head;
        Node pre = head;
        
        if (getLength()==0){
            return null;
        }
        
        while (temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        
        pre.next=null;
        tail=pre;
        length--;
        
        if (getLength()==0){
            head = null;
            tail = null;
        }
        
        return temp;
        
    }
    
    public Node getNode(int index){
        if (index<0 || index > getLength()) return null;
        Node temp = head;
        for (int i = 0; i <index; i++) {
            temp = temp.next;
        }
        return temp;
        
    }
    
    public int getIndexByValue(int value){
        if (getLength()==0) return -1;
        
        Node temp = head;

        for (int i = 0; i <getLength(); i++) {
            if (temp.value==value)
                return i;
            else {
                temp = temp.next;
            }
        }
        return -1;
    }
    
    public Node removalFromPosition(int index){
        if (index<0 || index>=length) return null;
        
        if (index==1) return removalFromBeginning();
        
        if (index==length-1) return removalFromEnd();
        
        Node prev = getNode(index-1);
        
        Node temp = prev.next;
        
        prev.next = temp.next;
        
        temp.next=null;
        
        length--;
        
        return temp;
        
    }

    public Node removalFromValue(int value){
        int index = getIndexByValue(value);
        if (index==-1) return null;
        else return removalFromPosition(index);
    }
    
    public Node insertAtPosition(int index, int data){
        
        if (index==0) return insertionAtFirst(data);
        if (index==getLength()) return insertionAtEnd(data);
        
        Node newNode = new Node(data);
        
        Node prev = getNode(index-1);
        
        newNode.next = prev.next;
        prev.next=newNode;
        length++;
        
        return newNode;
        
    }
    
}
