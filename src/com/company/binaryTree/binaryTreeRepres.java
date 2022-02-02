package com.company.binaryTree;

import java.util.*;

public class binaryTreeRepres {
    Node root;
    binaryTreeRepres() {
        root = null;
    }

    //preorder traversal using recursion
    public void preorder(Node node){

        if(node==null){
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }
    //preorder traversal using iteration
    public void preOrder2(Node node){
        if(node==null){
            return;
        }
        Stack<Node>s=new Stack<>();
        s.push(node);
        while(!s.isEmpty()){
            node=s.pop();
            System.out.println(node.data);
            if(node.right!=null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
        }
    }


    //inorder traversal using recursion
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);

    }

    //post order traversal using recursion
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    //level order traversal
    public void leveOrder(Node node){
        //using queue data structure
        ArrayList<List<Integer>>list=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            ArrayList<Integer>temp = new ArrayList<>();
            Node curr=q.poll();
            temp.add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            list.add(temp);
        }
        System.out.println(list);
    }



    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int key){
            this.data=key;
        }


    }
    public static void main(String[] args) {
//        Node n=new Node(2);
//        n.left=new Node(1);
//        n.right=new Node (3);
//        n.right.right=new Node(5);
        binaryTreeRepres t=new binaryTreeRepres();
        t.root=new Node(1);
        t.root.left=new Node(2);
        t.root.right=new Node(3);
        t.root.left.left = new Node(5);
        t.root.left.right = new Node(6);
//        t.preorder(t.root);
//        t.inOrder(t.root);
//        t.postOrder(t.root);
//        t.leveOrder(t.root);
        t.preOrder2(t.root);








    }
}
