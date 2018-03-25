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

public class LevelOrderTraversal {

    public void levelOrder(Node root) {

        if(root == null) {
            System.out.println("Print a valid tree");
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        System.out.println();

        while(q.size() > 0) {
            root = q.poll();

            System.out.println(root.data + " ");

            if(root.left != null) {
                q.add(root.left);
            }
            if(root.right != null) {
                q.add(root.right);
            }
        }
    }

    public static void main(String args[]) {
      LevelOrderTraversal lot = new LevelOrderTraversal();
      BinaryTree bt = new BinaryTree();
      Node head = null;
      head = bt.addNode(5, head);
      head = bt.addNode(10, head);
      head = bt.addNode(7, head);
      head = bt.addNode(4, head);
      head = bt.addNode(5, head);
      head = bt.addNode(9, head);
      head = bt.addNode(3, head);
      lot.levelOrder(head);
    }


}
