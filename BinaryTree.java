/***
 * Class representing the binary tree
 *
 * @author Aditya Kulai
 ***/

/* Importing libraries */
import java.io.*;
import java.util.*;

/* Creating a Node class */
class Node {

  int value;
  Node left;
  Node right;

  Node(int value) {
    this.value = value;
    left = null;
    right = null;
  }

  /* Function to get left node */
  public Node getLeft()
  {
         return left;
  }
  /* Function to get right node */
  public Node getRight()
  {
         return right;
  }

  /* Function to set data to node */
  public void setData(int d)
  {
         data = d;
  }
  /* Function to get data from node */
  public int getData()
  {
         return data;
  }
}

/* Binary Tree class */
public class BT {
    private Node root;    // root of the tree

    /* Constructor */
    public BT {
      root = null;
    }

    /* Functions to insert data */
    public void insert (int data){
      root = insert(root, data)
    }

    /* Function to insert data recursively */
    private Node insert (Node node, int data) {
      if (node == null) {
        node = new Node(data)
      }
      else {
        if (node.getRight() == null)
          node.right = insert (node.right, data);
        else
          node.left = insert (node.left, data);

        }
      }

    /* Function to search for an element */
    public boolean search(int val)
      {
          return search(root, val);
      }

    /* Function to search for an element recursively */
    private boolean search(Node r, int val)
      {
          if (r.getData() == val)
              return true;
          if (r.getLeft() != null)
              if (search(r.getLeft(), val))
                     return true;
          if (r.getRight() != null)
              if (search(r.getRight(), val))
                     return true;
          return false;
         }

     /* Function for inorder traversal */
     public void inorder()
      {
            inorder(root);
      }
      private void inorder(Node r)
      {
           if (r != null)
              {
                  inorder(r.getLeft());
                  System.out.print(r.getData() +" ");
                  inorder(r.getRight());
              }
      }
}

/* Driver class */
public class BinaryTree {
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BT bt = new BT();

        /*  Performing tree operations  */
        System.out.println("Binary Tree Test\n");
        char ch;
        do
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");

            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 :
                System.out.println("Enter integer element to insert");
                bt.insert( scan.nextInt() );
                break;
            case 2 :
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bt.search( scan.nextInt() ));
                break;
            default :
                System.out.println("Wrong Entry \n ");
                break;
            }
            /*  Print tree  */

            System.out.print("\n Printing using In order traversal : ");
            bt.inorder();

            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
