public class CustomLinkedList {

    Node head = null;

    public void displayCustomLinkedList(){
        Node ptr = this.head;        
        while(ptr.next != null){
            System.out.print(ptr.value + " -> ");
            ptr = ptr.next;
        }
        System.out.print(ptr.value + " -> null");
    }

    public void addFirst(Node node){
        if (this.head == null){
            this.head = node;
        }
        else{            
            node.next = this.head;            
            this.head = node;           
        }
        
    }
    public void addLast(Node node){
        if (this.head == null){
            this.head = node;
        }
        else{
            Node ptr = this.head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }
    
}
