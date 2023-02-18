package com.company.binaryTree;

public  class buildtreepreeordercode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     static class binarytree{
        static int idx=-1;
      public static Node fun(int[]arr){
          idx++;
          if(arr[idx]==-1){
              return null;
          }
          Node n=new Node(arr[idx]);
          n.left=fun(arr);
          n.right=fun(arr);

          return n;
      }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-1,-1,5,-1,-1,3,-1,6};
        binarytree t=new binarytree();
        Node roott=t.fun(arr);
        System.out.println(roott.data);




    }
}
