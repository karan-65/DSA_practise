package com.company.linkedlist;

public class doublyll {
   private Node head;

    //inserting at first
    public void insertfirst(int val){
        Node node =new Node(val);
        if(head!=null){
            head.prev=node;
        }
        node.next=head;
        node.prev=null;
        head=node;
    }
    //displaying in linkedlist
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.println(temp.data);
            last=temp;
            temp=temp.next;

        }
        //printing reverse in doubly linked list
        while(last!=null){
            System.out.println(last.data);
            last=last.prev;
        }
    }



    private class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }

        Node(int data,Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }

    }
    public static void main(String[] args) {
        doublyll ll=new doublyll();
        ll.insertfirst(4);
        ll.insertfirst(5);
        ll.insertfirst(46);
        ll.display();



    }
}
