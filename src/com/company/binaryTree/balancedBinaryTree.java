package com.company.binaryTree;
//checking if the tree is balanced or not
//if it is balanced we will return the height
//if not balanced we will return -1
public class balancedBinaryTree {

        public static int balancedbinary(Node node){
            if(node==null){
                return 0;
            }
            int leftheight=balancedbinary(node.left);
            if(leftheight==-1){
                return -1;
            }
            int rightheight=balancedbinary(node.right);
            if(rightheight==-1){
                return -1;
            }
            if(Math.abs(leftheight-rightheight)>1){
                return -1;
            }
            return Math.max(leftheight,rightheight)+1;


    }

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node node =new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        System.out.println(balancedbinary(node));


    }
}
