package com.company.binarySearchtree;

public class constructingFromPreorder {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    //should look at leetcode submission for reference

    int i=0;
    public Node bstFromPreorder(int[]arr){
        return fun(arr,Integer.MAX_VALUE);
    }
    public Node fun(int[]arr,int right){
        if(i==arr.length||arr[i]>right){
            return null;
        }
        Node node=new Node(arr[i++]);
        node.left=fun(arr,node.data);
        node.right=fun(arr,right);
        return node;
    }
    public static void main(String[] args) {

    }
}
