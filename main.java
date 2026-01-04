//this code is for printing a linkedlist and printing it 
import java.util.*;
class Node{
 Node next;
 int data;
 Node(int data, Node next){
  this.data = data; 
  this.next = next;
}
}
public class main{
public static void printList(Node head){
 Node ptr= head;
 while(ptr != null){
  System.out.print(ptr.data + "->");
  ptr = ptr.next;
}
System.out.print("null");
}
public static void main(String args[]){
  int keys[] = {1,2,3,4,5};
  Node head = null;
  for(int i = 4; i>=0; i--){
    head = new Node(keys[i], head);
}
printList(head);
}
}
