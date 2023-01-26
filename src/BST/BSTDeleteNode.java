/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST;

/**
 *
 * @author User
 */
public class BSTDeleteNode {
    public static class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public BSTDeleteNode() {
        this.root = null;
    }
    public void insert(int newData) {
        this.root = insert(root, newData);
    }

    public Node insert(Node root, int newData) {
        if (root == null) {
            root = new Node(newData);
            return root;
        }
        else if (root.data >= newData) {
            root.left = insert(root.left, newData);
        } else {
            root.right = insert(root.right, newData);
        }
        return root;
    }
    public void deleteANode(Node node) {
        deleteNode(this.root, node);
    }

    private Node deleteNode(Node root, Node node) {
        if (root == null) {
            return null;
        } else if (node.data < root.data) {
            root.left = deleteNode(root.left, node);
        } else if (node.data > root.data) {
            root.right = deleteNode(root.right, node);
        } else if(root.data==node.data){
            if (root.left != null && root.right != null) {
                int lmax = findMaxData(root.left);
                root.data = lmax;
                root.left = deleteNode(root.left, new Node(lmax));
                return root;
            }
            else if (root.left != null) {
                return root.left;
            }
            else if (root.right != null) {
                return root.right;
            }
            else {
                return null;
            }
        }
        return root;
    }
    public int findMaxData(Node root) {
        if (root.right != null) {
            return findMaxData(root.right);
        } else {
            return root.data;
        }
    }

    public void preorder(){
        preorder(root);
        System.out.println();
    }
    public void preorder(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }


    public static void main(String[] args) {
        BSTDeleteNode bst = new BSTDeleteNode();
        bst.insert(8);
        bst.insert(5);
        bst.insert(9);
        bst.insert(3);
        bst.insert(7);        
        bst.preorder();
        bst.deleteANode(new Node(9));
        bst.preorder();
    }
}
