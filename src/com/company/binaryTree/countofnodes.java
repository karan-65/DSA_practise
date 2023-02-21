package com.company.binaryTree;

public class countofnodes {
    Node root;
    countofnodes(){
        this.root=null;
    }
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }

    }
    public static int fun(Node root){
        if(root==null){
            return 0;
        }

        int l=fun(root.left);
        int r=fun(root.right);
        int count=l+r;
        return count+1;

    }
    public static void main(String[] args) {
        countofnodes t=new countofnodes();
        t.root=new Node(1);
        t.root.left=new Node(2);
        t.root.right=new Node(3);
        t.root.left.left = new Node(5);
        t.root.left.left.left=new Node(4);
        t.root.left.right = new Node(6);
        System.out.println(fun(t.root));

    }
}
