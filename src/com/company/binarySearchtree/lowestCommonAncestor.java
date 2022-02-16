package com.company.binarySearchtree;

public class lowestCommonAncestor {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public Node fun(Node node,Node  left,Node right){
        if(node==null){
            return null;
        }
        int curr=node.data;
        if(curr< left.data&&curr<right.data){
            return fun(node.right,left,right);
        }
        if(curr>left.data&&curr> right.data){
            return fun(node.left,left,right);
        }
            return node;

    }
    public static void main(String[] args) {

    }
}
