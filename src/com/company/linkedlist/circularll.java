package com.company.linkedlist;

public class circularll {
    private Node head;
    private Node tail;
    circularll(){
        this.head=null;
        this.tail=null;
    }
    public void addlast(int val){
        Node node =new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }while(temp!=head);
        }
    }

    private class Node{
         int data;
         Node next;
         Node(int data){
             this.data=data;
         }

         Node(int data,Node next){
             this.data=data;
             this.next=next;
         }

    }
    public static void main(String[] args) {
        circularll cll= new circularll();
        cll.addlast(1);
        cll.addlast(2);
        cll.addlast(3);
        cll.display();


    }
}
