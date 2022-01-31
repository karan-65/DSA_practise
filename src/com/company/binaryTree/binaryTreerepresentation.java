package com.company.binaryTree;

public class binaryTreerepresentation {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int key){
            this.data=key;
        }
    }
    public static void main(String[] args) {
        Node n=new Node(2);
        n.left=new Node(1);
        n.right=new Node (3);
        n.right.right=new Node(5);



    }
}
