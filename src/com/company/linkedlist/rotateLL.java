package com.company.linkedlist;
//rotating the list from given kth position
public class rotateLL {
    public Node fun(Node head,int k){
        if(head==null||head.next==null||k==0){
            return head;
        }
        //calculating the size of list
        Node temp=head;
        int size=1;
        while (temp.next!=null){
            size=size+1;
            temp=temp.next;
        }
        temp.next=head;
//if k is greater tha n size we can use module to find remainder
        //as for ex if size is 5 and k is 5,10,15 or any multiple of 5 it will have to return
        //same node so that why we take the remainder
        k=k%size;
        //this step will make us reach one node behind from where we have to rotate
        k=k-size;
        while(k-->0)
            temp= temp.next;
            head=temp.next;
            temp.next=null;


        return head;

        }
    private class Node {
        private int value;
        private Node next;

        public Node() {

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
        public static void main(String[] args) {

        }
    }
