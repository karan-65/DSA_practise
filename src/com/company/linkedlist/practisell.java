package com.company.linkedlist;

public class practisell {
    Node head;
    public  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

        public void addfirst(int data){
            Node n=new Node(data);
            n.next=head;
            head=n;

        }

        public void addlast(int data){
            Node n=new Node(data);
            Node temp=null;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=n;
        }

    }
    public static void main(String[] args) {
        practisell ll=new practisell();


    }
}
