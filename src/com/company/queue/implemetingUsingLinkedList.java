package com.company.queue;

public class implemetingUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class queue{
        Node head=null;
        Node tail=null;


        public  boolean isEmpty(){

            return head==null&&tail==null;
        }


        public  void add(int data){
            Node node=new Node(data);
            if(tail==null){
                tail=head=node;
            }
            tail.next=node;
            tail=node;
        }

        //takes o(n) while insertion
        public  int remove(){
            if(isEmpty()){
                System.out.println("is full");
                return -1;
            }
          int front=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;

            return front;

        }

        public int peek(){
            if(isEmpty()){
                System.out.println("is empty");
                return -1;
            }
            return head.data;
        }



    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
