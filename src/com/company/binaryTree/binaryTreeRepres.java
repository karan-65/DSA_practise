package com.company.binaryTree;

public class binaryTreeRepres {
    Node root;
    binaryTreeRepres() {
        root = null;
    }

    //preorder traversal using recursion
    public void preorder(Node node){

        if(node==null){
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    //inorder traversal using recursion
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);

    }


    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int key){
            this.data=key;
        }


    }
    public static void main(String[] args) {
//        Node n=new Node(2);
//        n.left=new Node(1);
//        n.right=new Node (3);
//        n.right.right=new Node(5);
        binaryTreeRepres t=new binaryTreeRepres();
        t.root=new Node(1);
        t.root.left=new Node(2);
        t.root.right=new Node(3);
        t.root.left.left = new Node(5);
        t.root.left.right = new Node(6);
        t.preorder(t.root);
        t.inOrder(t.root);








    }
}
