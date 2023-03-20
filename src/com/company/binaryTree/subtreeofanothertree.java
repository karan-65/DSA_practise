package com.company.binaryTree;

public class subtreeofanothertree {
    static class  Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    //this function further compares each value of node
    public static boolean isidentical(Node node,Node subroot){
        if(node==null&&subroot==null){
            return true;
        }
        else if(node==null||subroot==null||node.data!=subroot.data){
            return false;
        }
        if(!isidentical(node.left,subroot.left)){
            return false;
        }
        if(!isidentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }

    //this function here checks if root exits or not
    public static boolean issubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isidentical(root,subroot)){
                return true;
            }
        }

        return issubtree(root.left,subroot)||issubtree(root.right,subroot);


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(5);


        Node subroot=new Node(3);
        subroot.left=new Node(5);
        subroot.left.left=new Node(6);

        System.out.println(issubtree(root,subroot));

    }
}
