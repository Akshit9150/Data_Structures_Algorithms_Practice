//the question is to print a linkedlist and i am indeed practicing it for the second
import java.util.*;
class Node{
 Node next;
 int data;
 Node(int data, Node next){
  this.next = next;
  this.data = data;
}
}
public class main2{
public static void printList(Node head){
  Node ptr = head; 
  while(ptr!=null){
   System.out.print(ptr.data + "->");
   ptr=ptr.next;
}
System.out.print("Null");
}
public static void main(String args[]){
  int keys[] = {1,2,3,4,5};
  Node head = null;
  for(int i=4; i>=0; i--){
    head = new Node(keys[i], head); 
}
printList(head);
}
}
