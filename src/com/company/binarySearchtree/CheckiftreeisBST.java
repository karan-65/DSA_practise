package com.company.binarySearchtree;

public class CheckiftreeisBST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    //insertion in bst
    public static Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        Node curr = node;
        while (true) {
            if (curr.data <= val) {
                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = new Node(val);
                    break;
                }
            } else {
                if (curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = new Node(val);
                    break;
                }
            }

        }
        return node;

    }

    public static void isBst(Node node)
    {
        if (isBst(node, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            System.out.println("The tree is a BST.");
        }
        else {
            System.out.println("The tree is not a BST!");
        }
    }
//recursive function for checking if it is bst
    public static boolean isBst(Node node ,int max,int min){
        if(node==null){
            return true;
        }
        if(node.data<min||node.data>max){
            return false;
        }
        return isBst(node.left,min,node.data)&&isBst(node.right,node.data,max);

    }
    public static void main(String[] args) {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
        isBst(root);



    }
}
