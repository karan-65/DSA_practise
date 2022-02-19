package com.company.binarySearchtree;

public class inorderSuccessor {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public Node fun(Node node,Node p){
        Node succesor=null;
        while(node!=null){
            if(p.data>= node.data){
                node=node.right;
            }
            else {
                succesor=node;
                node=node.left;
            }
        }
        return succesor;
    }

    public static void main(String[] args) {

    }
}
