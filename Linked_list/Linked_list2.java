package Linked_list;

// number of ways to access linked list;

public class Linked_list2{

    public static class Node{
        int data;
        Node nextAddress ;

        public Node(int data){
            this.data= data;
        }
    }

    public static void main(String args[]){
        Node a= new Node(4);
        Node b= new Node(6);
        Node c = new Node(8);
        Node d= new Node(10);

        a.nextAddress=b;
        b.nextAddress=c;
        c.nextAddress=d;

        // this is the method to access all the node

        // System.out.println(a.data);
        // System.out.println(a.nextAddress.data);
        // System.out.println(a.nextAddress.nextAddress.data);
        // System.out.println(a.nextAddress.nextAddress.nextAddress.data);
        

        // Now accessing the using the loop if only head  details given

        Node temp= a;
        while(temp != null){
            System.out.println(temp.data);
            temp= temp.nextAddress;
        }
    }
}