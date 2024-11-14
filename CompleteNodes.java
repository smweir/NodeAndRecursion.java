/* A program to find the all NON-EMPTY complete nodes in a given binary tree  
* @ Author: Samantha Weir
*/ 

public class CompleteNodes { 
  
    /* Traverses given tree in Inorder fashion and  
     * prints all NON-EMPTY COMPLETE nodes. That is print all nodes
     * that have both children as non-empty.  
     *
     */
    public static void findCompleteNode(Node root) {  
       if (root == null) {
            return;
        }

        if (root.left != null && root.right != null) {
            System.out.print(root.data + " ");
        }

        findCompleteNode(root.left);
        findCompleteNode(root.right);
    }  
  
    public static void main(String args[]) { 
        Node root = new Node(1);  
        root.left = new Node(2);  
        root.right = new Node(3);  
        root.left.left = new Node(4);  
        root.right.left = new Node(5);  
        root.right.right = new Node(6);  
        root.right.left.right = new Node(7);  
        root.right.right.right = new Node(8);  
        root.right.left.right.left = new Node(9);  
        System.out.print("Complete nodes in this tree are: ");
        findCompleteNode(root);   
    } 
} 
  
 
