package com.company.linkedlist;

public class addTwoNumbersGivenAsLinkedList {
    public Node fun(Node l1,Node l2){
        Node dummy=new Node();
        Node temp=dummy;
        int carry=0;
        while(l1!=null||l2!=null||carry==1){
            int sum=0;
            if(l1!=null){
                sum +=l1.value;
                l1=l1.next;
            }
            if(l2!=null){
                sum +=l2.value;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node node=new Node(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }

    private class Node{

        private int value;
        private Node next;

        public Node(){

        }
        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    public static void main(String[] args) {

    }
}
