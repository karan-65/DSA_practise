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
    //inorder in bst means it will return it in sorted manner
    //so logically we have to find the next greater of the given node
    public Node fun(Node node,Node p){
        Node succesor=null;
        while(node!=null){
            //if p is bigger or equal we will go to right
            if(p.data>= node.data){
                node=node.right;
            }
            else {
                //here we will store the node in succesor while going to left
                //just dry run this once you will understand it nicely
                succesor=node;
                node=node.left;
            }
        }
        return succesor;
    }

    public static void main(String[] args) {

    }
}
