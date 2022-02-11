package com.company.binarySearchtree;
//itertaively inserting in a binary search tree
//check this again as its main class is not written
public class insertinginBST {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public Node insert(Node node,int val) {
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


    public static void main(String[] args) {

    }
}
