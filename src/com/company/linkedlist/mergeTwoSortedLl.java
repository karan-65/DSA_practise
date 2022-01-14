package com.company.linkedlist;
//most optimized approach without using another linkedlist

public class mergeTwoSortedLl {
    public Node fun(Node l1,Node l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        //point l1 to the lowest of l1 and l2
        //l1 will always point to the lowest
        if(l1.value<l2.value){
        Node temp=l1;
        l1=l2;
        l2=temp;
        }
//storing the l1 value for head
        Node res=l1;
        while(l1!=null && l2!=null){
            Node tmp=null;
            while(l1!=null && l1.value<=l2.value){
                tmp=l1;
                l1=l1.next;
            }
            tmp.next=l2;

            Node temp=l1;
            l1=l2;
            l2=temp;
        }
        return res;


    }
    private class Node{

        private int value;
        private Node next;

        public Node(){

        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
}

    public static void main(String[] args) {

    }
}
