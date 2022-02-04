package com.company.binaryTree;

public  class heightOfBinaryTree {
    Node root;
    heightOfBinaryTree(){
        this.root=null;
    }
    public static int height(Node node){
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }
    //calculating height using recursion
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int key){
            this.data=key;
        }
    }
    public static void main(String[] args) {
        heightOfBinaryTree t=new heightOfBinaryTree();
        t.root=new Node(1);
        t.root.left=new Node(2);
        t.root.right=new Node(3);
        t.root.left.left = new Node(5);
        t.root.left.right = new Node(6);
        System.out.println(height(t.root));

    }

}
