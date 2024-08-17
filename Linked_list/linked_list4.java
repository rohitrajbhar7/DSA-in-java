
public class linked_list4
{
    
     public static class Node{
            int data;
            Node nextAddress;
            public Node(int data){
                this.data= data;
            }
        } 
        
    public static class Linkedlist{
    Node head=null;
    Node tail=null;
    
        public  void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head=temp;
            }else{
                tail.nextAddress=temp;
            }
            tail=temp;
        }
    
        public void display(){
            Node current = head;
            while(current!=null){
                System.out.println(current.data);
                current=current.nextAddress;
            }
        }
        
       
    }
	public static void main(String[] args) {
	    Linkedlist ll= new Linkedlist();
	    ll.insertAtEnd(4);
	    ll.insertAtEnd(5);
	    ll.display();
	    
	}
}