
public class Linked_list3
{
    public static int countNodes(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.nextAddress;
        }
        return count;
    }
    
    public static class Node{
        int data;
        Node nextAddress;
        
        public Node(int data){
            this.data= data;
        }
    }
	public static void main(String[] args) {
		Node a= new Node(4);
		Node b= new Node(6);
		Node c= new Node(8);
		Node d= new Node(9);
		
		a.nextAddress= b;
		b.nextAddress=c;
		c.nextAddress=d;
		
		System.out.println(countNodes(a));
	}
}