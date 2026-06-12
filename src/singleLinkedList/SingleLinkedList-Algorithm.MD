SingleLinkedList - Algorithm

-- Operations
1) Print Linked List

    1.1) print Head

    1.2) print tail

2) Length of Linked List

3) Linked List Insertion

    3.1) Insertion at Beginning

    3.2) Insertion at End

    3.3) Insertion at Given position

4) Linked List Deletion

    4.1) Deletion at Beginning

    4.2) Deletion at End

    4.3) Deletion at Given Position

    4.4) Deletion By Given Value

5) Search in a Linked List

6) Nth Node from Start

7) Nth Node from End


1) Print Linked List

   1) take a first node i.e head
   
   2) assign node to temp for iteration
   
   3) while temp is not null
   
   4) print temp.data 
   
   5) iterate until temp becomes null

1.1) print Head

    1) take head value and print

1.2) print Head

    2) take tail value and print

2) Length of Linked List
    
   return the length of a Linked list

   4) Linked List Insertion
   
       4.1) Insertion at Beginning 
        
           4.1.1) Create a New Node
               4.1.1.1) If Length is 0 then New Node is head as well as tail
           4.1.2) point New Node's next pointer to head (this was head node earlier).
           4.1.3) then make head as New Node
           4.1.4) increament the length in both the cases
       
       4.2) Insertion at End
            
            4.2.1) Create a New Node
                4.2.1.1) If Length is 0 then New Node is head as well as tail
            4.2.2) point the tail's next pointer to new Node
            4.2.3) then make tail as new Node
            4.2.4) Increament length in both the cases
   
   5) Linked List removal
   
        5.1) Removal From Beginning
   
            5.1.1) If Length is 0 then return null
            5.1.2) assign head node to temp
                5.1.2.1) make head = temp.next
                5.1.2.2) make temp.next to null
                5.2.2.3) decreament the length
            5.1.3) after all above cases if length is zero
                5.1.3.1) then make head and tail to null
            5.1.4) return temp
   
        5.2) Removal From End
            
            5.2.1) If Length is 0 then return null
            5.2.2) assign head node to temp and prev
                5.2.2.1) iterate temp till last node
                5.2.2.2) and prev node to last but 1 node
            5.2.3) make prev node.next to null
            5.2.4) make tail to point to prev node
            5.2.5) decreament length
            5.2.6) after all above cases if length is zero
                5.2.6.1) then make head and tail to null
            5.2.7) return temp







