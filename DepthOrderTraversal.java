import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node next;

    // public Node(int value, Node left, Node right) {
    //   this.value = value;
    //   this.left = null;
    //   this.right = null;
    // }
    public static Node newNode(int data){
        Node n = new Node();
        n.left = null;
        n.right = null;
        n.data = data;

        return n;
    }

}

class BinaryTree {

    public Node addNode(int data, Node head){
        Node tempHead = head;
        Node n = Node.newNode(data);
        if(head == null){
            head = n;
            return head;
        }
        Node prev = null;
        while(head != null){
            prev = head;
            if(head.data < data){
                head = head.right;
            }else{
                head = head.left;
            }
        }
        if(prev.data < data){
            prev.right = n;
        }else{
            prev.left = n;
        }
        return tempHead;
    }
}

public class DepthOrderTraversal {

  // Inorder traversal
  public void inOrder(Node root){
      if(root == null){
          return;
      }
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
  }

  // Preorder order traversal
  public void preOrder(Node root){
      if(root == null){
          return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
  }

  // Post order traversal
  public void postOrder(Node root){
      if(root == null){
          return;
      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
  }

  public static void main(String args[]) {

      BinaryTree bt = new BinaryTree();
      Node head = null;
      head = bt.addNode(5, head);
      head = bt.addNode(10, head);
      head = bt.addNode(7, head);
      head = bt.addNode(4, head);
      head = bt.addNode(5, head);
      head = bt.addNode(9, head);

      DepthOrderTraversal dot = new DepthOrderTraversal();
      dot.inOrder(head);
      System.out.println();
      dot.preOrder(head);
      System.out.println();
      dot.postOrder(head);
      System.out.println();
  }
}
