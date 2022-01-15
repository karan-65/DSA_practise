package com.company.linkedlist;
//finding middle of linkedlist using the concept of slow and fast node


public class findMiddleOfll {
    public Node middle(Node head){
        Node fast=head;
        Node slow =head;
        while(fast!=null&&fast.next.next!=null){
            //first slow will move one step
            slow=slow.next;
            //fast will move two steps
            fast=fast.next.next;
        }
        return slow;
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
