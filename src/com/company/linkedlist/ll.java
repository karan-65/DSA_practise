package com.company.linkedlist;

public class ll {
    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size=0;
    }
    //for inserting at first
    public void insertAtfirst(int val){
        Node node= new Node(val);
         if(tail==null){
            tail=node;

         }
        node.next=head;
        head=node;
        size++;
    }
    //for inserting a element at last
    public void insertLast(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }
//for inserting at any index
    public void insertany(int val,int idx){
        Node node=new Node(val);
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;

    }

    //for displaying a ll
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public static void main(String[] args) {
        ll linkedlist=new ll();
        linkedlist.insertAtfirst(3);
        linkedlist.insertAtfirst(4);
        linkedlist.insertAtfirst(5);
        linkedlist.insertLast(6);
        linkedlist.insertany(7,2);
        linkedlist.display();


    }
}
