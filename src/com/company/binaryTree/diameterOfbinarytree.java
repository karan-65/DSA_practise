package com.company.binaryTree;
//should practise it again
public class diameterOfbinarytree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static int diameter=0;
    public static int diameter(Node node){
        height(node);
        return diameter;

    }

    public static int height(Node node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        diameter=Math.max(diameter,left+right+1);
        return Math.max(left,right)+1;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        System.out.println(diameter(root));
    }
}
