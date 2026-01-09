//this code is for left view of the tree
import java.util.*;
class Node{
  int data;
  Node left = null;
  Node right = null;
  Node(int data){
    this.data= data;
}
}
public class tree6{
  public static void leftview(Node root, int level, Map<Integer, Integer> map){
    if(root == null){
      return;
}
    map.putIfAbsent(level, root.data);
    leftview(root.right, level+1, map);
    leftview(root.left,level+1, map);
}
  public static void leftview(Node root){
    Map<Integer, Integer> map = new HashMap<>();
    leftview(root, 1, map);
    for(int i=1; i<=map.size(); i++){
     System.out.print(map.get(i)+" ");
}
}
  public static void main(String args[]){
     Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.right = new Node(4);
     root.right.left = new Node(5);
     root.right.right = new Node(6);
     root.right.left.left = new Node(7);
     root.right.left.right = new Node(8);
     leftview(root);
}
}





