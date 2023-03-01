package com.company.binaryTree;

public class sumofnodes {
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
        int left=fun(root.left);
        int right=fun(root.right);
        int sum=root.data+left+right;
        return sum;
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.right=new Node(6);
        System.out.println(fun(root));
    }
}
