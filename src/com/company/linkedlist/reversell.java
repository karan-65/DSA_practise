package com.company.linkedlist;





public class reversell {
    private Node head;
    private Node tail;
    private int size;

    public reversell(){
        this.size=0;
    }
    //for inserting at first
    public void insertAtFirst(int val){
        Node node= new Node(val);
        if(tail==null){
            tail=node;

        }
        node.next=head;
        head=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

//reverse a linked list iterative
    public void reversell(){
        if(head==null||head.next==null){
            return;
        }
        Node prev =null;
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        head=prev;
    }

    //reverse a linked list recursively
    public Node recursivereverse(Node head){
        if(head==null||head.next==null){
            return head;
        }

        Node newhead=recursivereverse(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value){

            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }


    public static void main(String[] args) {
        reversell ll= new reversell();
        ll.insertAtFirst(1);
        ll.insertAtFirst(2);
        ll.insertAtFirst(3);
        ll.insertAtFirst(4);

        ll.head=ll.recursivereverse(ll.head);
        ll.display();


    }

}
