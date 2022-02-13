package com.company.binarySearchtree;
//deletion basically look for three steps
//1 if there is 2 children nodes
//2 if there is 1 children node
//3 no child node
//also refer your leetcode solution and dicussion tab there
//pepcoding reference has been taken
public class deletionBST {
    public class Node{
        int data;
        Node right=null;
        Node left=null;
        Node(int data){
            this.data=data;
        }
    }
    public int max(Node node){
        if(node.right!=null){
            return max(node.right);
        }
        else{
            return node.data;
        }
    }
    public Node delete(Node node,int data){
        if(node==null) {
            return null;
        }if(node.data>data){
            node.left=delete(node.left,data);
        }
        else if(node.data<data){
            node.right=delete(node.right,data);
        }
        else{
        if(node.left!=null&&node.right!=null){
        int max=max(node.left);
        node.data=max;
        node.left=delete(node.left,max);
        return node;
        }
        else if(node.right!=null){
                return node.right;
            }
        else if(node.left!=null){
                return node .left;
            }
        else {
            return null;
        }
        }
        return node;
    }
    public static void main(String[] args) {

    }
}
