package com.company.binarySearchtree;
//look to change the main class after implementing insert
public class searchinginBST {
    public static class Node{
        int data;
        Node left=null;
        Node right=null;
        Node(int data){
            this.data=data;
        }
    }
    public static Node search(Node root,int val){
        {
            if(root==null || root.data== val)
                return root;
            if(root.data > val)
                return search(root.left, val);
            return search(root.right, val);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(3);
        root.right=new Node(10);
        root.left.left=new Node(1);
        root.left.right=new Node(6);
        root.right.left=new Node(9);
        root.right.right=new Node(14);
        root.right.right.right=new Node(18);
        System.out.println(search(root,10));
    }
}
