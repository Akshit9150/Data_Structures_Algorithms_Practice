//trees to check if the two trees are identical
import java.util.*;
class Node{
  int key;
  Node left = null, right = null;
  Node(int key){
    this.key = key;
}
}

class tree1{
  public static Boolean isIdentical(Node x, Node y){
    if(x == null && y == null){
	return true;
} 
    return (x!=null && y!=null) && (x.key == y.key) && isIdentical(x.left, y.left) && isIdentical(x.right, y.right);
}
  public static void main(String args[]){
    Node x= new Node(15);
    x.left = new Node(10);
    x.right = new Node(20);
    x.left.left = new Node(8);
    x.left.right = new Node(12);
    x.right.left = new Node(16);
    x.right.right = new Node(25);

    Node y = new Node(15);
    y.left = new Node(10);
    y.right = new Node(20);
    y.left.left = new Node(8);
    y.left.right = new Node(12);
    y.right.left = new Node(16);
    y.right.right = new Node(25);

    if(isIdentical(x,y)){
      System.out.println("The binary trees are identical");
}
    else{
      System.out.println("The given binary trees are not identical");
}
}
}