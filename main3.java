//this is the code for reversing a linked list
import java.util.*;
class Node{
 Node next; 
 int data;
 Node(int data, Node next){
  this.next = next;
  this.data = data;
}
}
public class main3{
 public static void printList(Node head){
  Node ptr = head;
  while(ptr != null){
    System.out.print(ptr.data + "->");
    ptr = ptr.next;
}
System.out.println("Null"); 
}
 public static Node reverse(Node head){
    Node previous = null;
    Node current  = head;
    while(current!=null){
      Node next= current.next;
      current.next= previous;
      previous = current;
      current = next;
}
return previous;
}
 public static void main(String args[]){
   int keys[]= {1,2,3,4,5,6,7,8,9};
   Node head = null;
   for(int i =keys.length-1; i>=0; i--){
     head = new Node(keys[i], head);
}
head= reverse(head);
printList(head);
}
}