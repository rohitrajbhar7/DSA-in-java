package Linked_list;

public class Linked_list1{
   public static class Node{
     int data;
     Node nextAddress;

     public Node(int data){
        this.data= data;
     }
   }

   public static void main(String args[]){
        Node a= new Node(4);
        Node b= new Node(6);
        Node c= new Node(8);

        a.nextAddress=b;
        b.nextAddress=c;
        System.out.println(a.data+" || "+ a.nextAddress);
        System.out.println(b.data+" || "+ b.nextAddress);
        System.out.println(c.data+" || "+ c.nextAddress);
   }
}