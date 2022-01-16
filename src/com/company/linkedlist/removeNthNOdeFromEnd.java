package com.company.linkedlist;
public class removeNthNOdeFromEnd {
//removing nth node from last of linkedlist

    //this is the best approach that takes o(n) with fast and slow pointer approach.
    public Node  removed(Node head, int n){
        Node start=new Node();
        start.next=head;
        Node fast=start;
        Node slow=start;
        for(int i=1;i<=n;++i){
            //fast will go till n
            fast=fast.next;
        }
        while(fast.next!=null){
            //after fast will reach n fast and slow will start moving until fast reaches null.
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return head;

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
